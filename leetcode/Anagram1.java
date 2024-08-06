import java.util.*;
class Anagram1 {
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
   if (s.length() != t.length()) return false;
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {
        counter[s.charAt(i) - 'a']++;
        counter[t.charAt(i) - 'a']--;
    }
    for (int count : counter) {
        if (count != 0) return false;
    }
    return true;
}
}