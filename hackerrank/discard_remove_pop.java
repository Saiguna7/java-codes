import java.util.*;
public class discard_remove_pop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String[] cm=sc.nextLine().split(" ");
           if (cm[0].equals("pop")) {
                if (!s.isEmpty()) {
                    s.remove(s.iterator().next());
                }
            } else if (cm[0].equals("remove")) {
                int element = Integer.parseInt(cm[1]);
                s.remove(element);
            } else if (cm[0].equals("discard")) {
                int element = Integer.parseInt(cm[1]);
                s.remove(element);
            }
        }
        // Calculate and print the sum of the elements in the set
        int sum = 0;
        for (int element : s) {
            sum += element;
        }
        System.out.println(sum);
        sc.close();
    }
}