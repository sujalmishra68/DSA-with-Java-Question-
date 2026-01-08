import java.util.Scanner;

public class first {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number:");
         int num1= sc.nextInt();
         System.out.println("Enter the Second number:");
         int num2= sc.nextInt();

         int greaterNumber;
         if(num1>num2){
            greaterNumber=num1;
           // System.out.println(num1+ " is the the greater number");
         }else{
              greaterNumber=num2;
            //System.out.println(num2+"is the greater number");
         }
         System.out.println(greaterNumber+" is the greater number");
    }
}
