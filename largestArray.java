import java.util.Arrays;

class Solution {

    
    public static int sortArr(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        
        return arr[arr.length - 1];
    }
}

public class largestArray {

    public static void main(String[] args) {
        // Initialize arrays
        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};
        
       
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr1));
        System.out.println("The Largest element in the array is: " + Solution.sortArr(arr2));
    }
}