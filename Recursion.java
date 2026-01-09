 import java.util.*;
public class Recursion {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Factorial generator\n");
        System.out.print("Enter your Number: ");
        int num= sc .nextInt();
    //     long fact= factorialIterative(num);
    //  System.out.println("your Faasctorisl number is:"+fact);
        long fact= Factorial(num);
     System.out.println("your Factorisl number is:"+fact);

    }
         // recursion
    public static long Factorial(int num){
       // System.out.println("factorial called for:"+num);  //use this when you want to see the factorial process
        if(num==1){
            return 1;
        }
        return num*Factorial(num-1);
    }
  //Iterative Method
    public static long factorialIterative(int num){ 
      long result =1;
      for(int i=1;i<=num;i++){
        result *= i;
      }
      return result;
    }
}
    

