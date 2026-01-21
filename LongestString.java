import java.util.*;

public class LongestString {

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // 🔹 MAIN FUNCTION (USER INPUT)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();   // full string input (spaces allowed)

        int result = lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring = " + result);

        sc.close();
    }
}

