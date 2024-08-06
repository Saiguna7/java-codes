import java.util.*;
public class Anagram {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        if (s.length() != t.length()) {
            System.out.println("false");
    }
    else{
        boolean r=isAnagram(s,t);
        System.out.println(r);
    }
}
    public static boolean isAnagram(String s, String t) {
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        return Arrays.equals(S,T);
    }
}
