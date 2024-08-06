import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;
import javax.swing.*;

public class MarketClearingWithGraphs extends JFrame {

    public MarketClearingWithGraphs(String title) {
        super(title);

        String[] participants = {"Player 1", "Player 2", "Player 3", "Player 4", "Player 5"};
        double[] prices = new double[]{0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};

        int[][] bids = new int[][]{
            {25, 25, 25, 25, 50, 50, 50, 50, 50, 50},
            {25, 25, 25, 25, 50, 50, 50, 50, 50, 50},
            {50, 50, 50, 50, 50, 50, 50, 50, 50, 100},
            {100, 100, 100, 100, 100, 100, 100, 100, 100, 100},
            {100, 100, 100, 100, 100, 100, 100, 100, 100, 100}
        };

        int[] totalSupply = new int[prices.length];


        // Calculate total supply and demand at each price
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < participants.length; j++) {
                totalSupply[i] += bids[j][i];
            }
        }

        DefaultXYDataset supplyDataset = new DefaultXYDataset();


        double[][] supplyData = new double[2][prices.length];

        for (int i = 0; i < prices.length; i++) {
            supplyData[0][i] = prices[i];
            supplyData[1][i] = totalSupply[i];
        }

        supplyDataset.addSeries("Supply Curve", supplyData);


        JFreeChart supplyChart = ChartFactory.createXYLineChart(
            "Supply Curve",
            "power(MW)",
            "Price(Rs/Kwh)",
            supplyDataset,
            PlotOrientation.HORIZONTAL,
            true,
            true,
            false
        );


        XYPlot supplyPlot = supplyChart.getXYPlot();

        // Customize plots if needed

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Supply Curve", new ChartPanel(supplyChart));

        setContentPane(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MarketClearingWithGraphs example = new MarketClearingWithGraphs("Market Clearing Example with Graphs");
            example.setSize(800, 600);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
