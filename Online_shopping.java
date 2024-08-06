import java.util.*;
public class Online_shopping{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),e=sc.nextInt(),f=sc.nextInt(),g=sc.nextInt(),h=sc.nextInt(),i=sc.nextInt();
        int p1=(a-(((a*b)/100)))+c,p2=(d-(((d*e)/100)))+f,p3=(g-(((g*h)/100)))+i;
        System.out.println("In FlipKart: Rs."+p1+"\nIn Snapdeal: Rs."+p2+"\nIn Amazon: Rs."+p3);
        if((p1<p2) ?(p1<p3):(p3>p1))
        {
             if(p1<p3)
             {
                System.out.println("Choose Flipkart");
             }
             else
             {
                System.out.println("Choose Amazon");
             }
        }
        else
        {
            System.out.println("Choose Snapdeal");
        }
         
    }
}