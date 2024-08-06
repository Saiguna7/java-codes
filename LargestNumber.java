import java.util.*;

public class LargestNumber {
    
    public static String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));
        if (numsStr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String num : numsStr) {
            sb.append(num);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        String largestNum = largestNumber(nums);
        System.out.println(largestNum);
    }
}
