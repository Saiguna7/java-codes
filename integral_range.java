import java.util.*;
class integrl_range
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt(),n=sc.nextInt(),sum1=0,sum2=0;
    for(int i=1;i<=n;i++)
    {
        if(i%m==0)
        {
         sum1=sum1+i;
        }
        else
        {
            sum2=sum2+i;
        }
    }
    int c=sum2-sum1;
    System.out.println(c);
}
}