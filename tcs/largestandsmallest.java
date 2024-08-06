public class largestandsmallest {
   static void largeandsmaller(int n){
    int d;
    int min1=Integer.MAX_VALUE;
    int max1=Integer.MIN_VALUE;
    while(n!=0){
        d=n%10;
        min1=Math.min(min1,d);
        max1=Math.max(max1,d);
        n=n/10;
    }
    System.out.println("max= "+max1);
    System.out.println("min= "+min1);

   }
    public static void main(String args[]){
        int n=27463;
    largeandsmaller(n);
    }
}
