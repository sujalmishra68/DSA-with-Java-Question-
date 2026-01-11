import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);  
      int num=5,guess;
      
      do{
          System.out.println("Guess the number between 1 to 100");
          guess=sc.nextInt();
          if(guess!=num){
            System.out.println("Better luck🤗 ... NEXT TIME..😊👌😉");
          }
      }while(guess!= num);
        System.out.println("you have successfully guess the number...👌❤️❤️");
      }
    }
    

