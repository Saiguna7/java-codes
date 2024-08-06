public class removeduli {

    public static String removedu(String str){
        String ans="";
        boolean[] map=new boolean[26];
        for(int i=0;i<str.length();i++){
            if(map[str.charAt(i)-'a']==false){
ans+=str.charAt(i);
map[str.charAt(i)-'a']=true;

            }
        }
        return ans;
    }
    public static void main(String args[]){
String str="cbacdcbc";
        System.out.println("Remove dulipcates "+removedu(str));
    }
}
