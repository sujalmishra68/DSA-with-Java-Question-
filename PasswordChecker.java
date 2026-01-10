import java.util.*;
public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to set your password \n");
        String password ;
     do{
        System.out.print("Enter your Password:");
        password =sc.nextLine();
          if(!isValidPassword(password)){
            System.out.println("❌ Wrong password. Password must be more than 6 characters. Try again.\n" );
        
          }
     } while(!isValidPassword(password));
     System.out.println("thanks for entering your password");

     
    
    }
    public static boolean isValidPassword(String password){
    return password.length()>6;
    }
}
