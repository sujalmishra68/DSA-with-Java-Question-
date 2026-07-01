import java.util.Scanner;
public class reverseString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    int length = str.length();
    int left = 0;
    int right = length - 1;

    char[] arr = str.toCharArray();

    char temp = arr[left];
arr[left] = arr[right];
arr[right] = temp;
System.out.println("Reversed string: " + new String(arr));

   
  }
}
