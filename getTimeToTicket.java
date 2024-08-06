import java.util.*;

public class TicketCounter {

    static int getTimeToTicket(int[] priorities, int k) {
        int time = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }

        while (!queue.isEmpty()) {
            int currentPriority = queue.poll();
            boolean hasHigherPriority = false;

            for (int priority : queue) {
                if (priority > currentPriority) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(currentPriority);
            } else {
                time++;
                if (k == 0) {
                    return time;
                }
            }

            k = (k - 1 + queue.size()) % queue.size();
        }

        return time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] priorities = new int[n];

        for (int i = 0; i < n; i++) {
            priorities[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        int timeToTicket = getTimeToTicket(priorities, k);
        System.out.println(timeToTicket);
    }
}
