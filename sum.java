// sum of array
 import java.util.Scanner;
public class sum {
public static void main(String[] args) {
    int n, sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        sum += arr[i];
    }
    System.out.println("The sum of the array is: " + sum);
}
    
}