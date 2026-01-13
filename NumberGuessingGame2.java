import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("Too High!");
            } else if (guess < randomNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}

