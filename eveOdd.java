import java.util.*;
public class eveOdd {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter the number:");
         int n= sc.nextInt();

         String reuslt=(n%2==0) ? "even":"odd";
     System.out.println(reuslt);
    }
    
}
