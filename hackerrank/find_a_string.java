import java.util.*;
class find_a_string{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();
        String subString = sc.nextLine().trim();
        int count = countSubstring(string, subString);
        System.out.println(count);
    }

    static int countSubstring(String string, String subString) {
        int count = 0;
        int substrLen = subString.length();
         
        for (int i = 0; i <= string.length() - substrLen; i++) {
            if (string.substring(i, i + substrLen).equals(subString)) {
                count++;
            }
        }

        return count;
    }
}

