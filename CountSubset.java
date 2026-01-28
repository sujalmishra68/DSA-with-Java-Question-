import java.util.*;

public class CountSubset {

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {1, 3, 2};
        int k1 = 3;
        System.out.println(sol.countSubset(arr1, k1)); // Expected: 2

        int[] arr2 = {4, 2, 3, 1, 2};
        int k2 = 4;
        System.out.println(sol.countSubset(arr2, k2)); // Expected: 3

        int[] arr3 = {10, 20, 30};
        int k3 = 25;
        System.out.println(sol.countSubset(arr3, k3)); // Expected: 0
    }
}

class Solution {

    public int countSubset(int[] arr, int k) {
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        Map<Integer, Integer> leftMap = new HashMap<>();
        generateSums(left, 0, 0, leftMap);

        int[] result = new int[1];
        generateAndCount(right, 0, 0, k, leftMap, result);

        return result[0];
    }

    private void generateSums(int[] arr, int idx, int sum, Map<Integer, Integer> map) {
        if (idx == arr.length) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            return;
        }
        generateSums(arr, idx + 1, sum, map);
        generateSums(arr, idx + 1, sum + arr[idx], map);
    }

    private void generateAndCount(int[] arr, int idx, int sum, int k,
                                  Map<Integer, Integer> leftMap, int[] result) {
        if (idx == arr.length) {
            result[0] += leftMap.getOrDefault(k - sum, 0);
            return;
        }
        generateAndCount(arr, idx + 1, sum, k, leftMap, result);
        generateAndCount(arr, idx + 1, sum + arr[idx], k, leftMap, result);
    }
}

