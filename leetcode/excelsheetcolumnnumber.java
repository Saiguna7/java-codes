import java.util.*;
class excelsheetcolumnnumber{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        int r=excel(s);
        System.out.println(r);
    }
    public  static int excel(String s){
        int r=0;
        Map<Character,Integer> al=new HashMap<>();
        for(int i=0;i<26;i++){
           int c=i+65;
           al.put((char) c,i+1);
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(n-1-i);
            r+=(al.get(ch)*Math.pow(26,i));
        }
        return r;
    } 
}