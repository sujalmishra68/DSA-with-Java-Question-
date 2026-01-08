 import java.util.*;
public class minTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter first number");
        int first= sc.nextInt();

        System.out.println("Enter the Second number");
        int Second= sc.nextInt();

        int min = (first< Second )? first :Second;
        System.out.println("Minimum is: "+min);
    }
    
}
