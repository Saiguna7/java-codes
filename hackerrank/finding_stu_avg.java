import java.util.*;
public class finding_stu_avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        HashMap<String, double[]> studentMarks = new HashMap<>();

        // Read the student data and store it in the HashMap
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            double[] scores = new double[parts.length - 1];

            for (int j = 1; j < parts.length; j++) {
                scores[j - 1] = Double.parseDouble(parts[j]);
            }

            studentMarks.put(name, scores);
        }

        // Read the query_name
        String queryName = scanner.nextLine();

        // Calculate the average for the query_name and print it with two decimal places
        if (studentMarks.containsKey(queryName)) {
            double[] scores = studentMarks.get(queryName);
            double sum = 0.0;

            for (double score : scores) {
                sum += score;
            }

            double average = sum / scores.length;
            System.out.printf("%.2f%n", average);
        }

        scanner.close();
    }
}
