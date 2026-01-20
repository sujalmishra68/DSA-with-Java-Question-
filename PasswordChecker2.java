import java.util.Scanner;

public class PasswordChecker2 {

    public static boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(ch)) {
                hasSpecial = true;
            } else {
                return false; // space found → instant reject
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("✅ Strong Password");
        } else {
            System.out.println("❌ Weak Password");
            System.out.println("Password must contain:");
            System.out.println("- Minimum 8 characters");
            System.out.println("- Uppercase letter");
            System.out.println("- Lowercase letter");
            System.out.println("- Digit");
            System.out.println("- Special character");
            System.out.println("- No spaces");
        }

        sc.close();
    }
}
