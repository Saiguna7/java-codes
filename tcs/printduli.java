public class printduli {
    public static void main(String args[]){
        String str="sinstriiintng";
              
        int[] a=new int[26];
        for(int i=0;i<str.length();i++){
            a[str.charAt(i)-'a']++;
        }
        for (int i=0;i<26;i++){
            if(a[i]>1){
                System.out.print((char)(i+'a')+" - "+a[i]);
            }
        }
            }
}
