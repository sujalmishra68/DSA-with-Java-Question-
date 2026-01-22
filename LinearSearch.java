import java.util.*;
class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println("Enter the key element: ");
        int key = sc.nextInt();
        
        // Linear search
        System.out.println("Linear Search: " + list.contains(key));

        // Binary search using Collections.binarySearch 
        // (list must be sorted)
        int index = Collections.binarySearch(list, key);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
