import java.util.*;
class  excelsheetcolumnnumber1{
        public static void main(String args[]){
            Scanner sc=new Scanner (System.in);
            String s=sc.nextLine();
            int r=excel(s);
            System.out.println(r);
        }
        public  static int excel(String s){
            int r=0;
            for(int i=0;i<s.length();i++){
             r=r*26;
             r+=((s.charAt(i)-'A')+1);
        }
        return r;
    }

}