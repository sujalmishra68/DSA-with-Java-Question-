import java.util.*;

public class ReverseWords {

    public static String reverseWords(String s) {
        if (s == null || s.trim().isEmpty()) return "";

        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();   // USER INPUT

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseWords(input));

        sc.close();
    }
}
