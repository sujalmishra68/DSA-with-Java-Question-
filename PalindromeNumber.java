import java.util.Scanner;

public class PalindromeNumber {

    // Function to check palindrome
    static boolean isPalindrome(int x) {

        // Negative numbers & numbers ending with 0 (except 0) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverseHalf = 0;

        while (x > reverseHalf) {
            reverseHalf = reverseHalf * 10 + x % 10;
            x = x / 10;
        }

        return (x == reverseHalf || x == reverseHalf / 10);
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}
