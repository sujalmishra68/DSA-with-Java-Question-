import java.util.*;

public class NextGreaterElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = nextGreaterElement(arr);

        // output
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return ans;
    }
}
