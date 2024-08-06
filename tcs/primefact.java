import java.util.ArrayList;

public class primefact {
    
    static ArrayList<Integer> prime(int n){
       ArrayList<Integer> primeFactors =new ArrayList<>();
       for (int i = 2; i <= n; i++) {
        if (n % i == 0) {
            primeFactors.add(i);
        }
        while(n%i==0){
            n=n/i;
        }
    }
    return primeFactors;
}
        public static void main(String args[]){
            int n=60;
            ArrayList<Integer> ans=prime(n);
            for (int factor : ans) {
            System.out.print(factor + " ");
        }
        System.out.println();
        }
}
