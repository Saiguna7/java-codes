public class reveverofnumber {
    static int revers(int n){
           int rev=0;
           int d;
          while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
          }
        return rev;
    }
    public static void main(String args[]){
        int n=4562;
        System.out.println(revers(n));
    }
}
