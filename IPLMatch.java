import java.util.Scanner;

public class IPLMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBalls = scanner.nextInt();
        int totalRuns = scanner.nextInt();
        int runsScored = scanner.nextInt();
        int ballsBowled = scanner.nextInt();
        int totalOvers = totalBalls / 6;
        double oversFinished = ballsBowled / 6.0;
        double currentRunRate = (runsScored * 6.0) / ballsBowled;
        double totalRunRate = (totalRuns * 1.0) / totalOvers;
        String eligibility = currentRunRate >= totalRunRate ? "Eligible to Win" : "Not Eligible to Win";
        System.out.println(totalOvers);
        System.out.printf("%.1f\n", oversFinished);
        System.out.printf("%.1f\n", currentRunRate);
        System.out.printf("%.1f\n", totalRunRate);
        System.out.println(eligibility);
    }
}
