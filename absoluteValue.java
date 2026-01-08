import java.util.*;
public class absoluteValue {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element:");
        int n= sc.nextInt();

        int abs= (n<0)? -n:n;
        System.out.println("Absolute value is:"+abs);
        ;
      
       System.out.println("Enter the Element:");
       int S =sc.nextInt();

String result = (S >= 80) ? "High"  : (S >= 50) ? "Moderate" : "Low";

System.out.println(result);



       }
}
