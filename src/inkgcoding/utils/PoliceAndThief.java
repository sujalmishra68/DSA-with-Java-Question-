import java.util.*;

public class PoliceAndThief {

    // Function to calculate maximum thieves caught
    public static int catchThieves(char[] arr, int k) {

        List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();

        // Store indices of police and thieves
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') {
                police.add(i);
            } else if (arr[i] == 'T') {
                thief.add(i);
            }
        }

        int i = 0, j = 0, count = 0;

        // Two-pointer greedy matching
        while (i < police.size() && j < thief.size()) {
            int p = police.get(i);
            int t = thief.get(j);

            if (Math.abs(p - t) <= k) {
                count++;
                i++;
                j++;
            } else if (t < p) {
                j++;
            } else {
                i++;
            }
        }

        return count;
    }

    // Main function
    public static void main(String[] args) {

        char[] arr1 = { 'P', 'T', 'T', 'P', 'T' };
        int k1 = 1;

        char[] arr2 = { 'T', 'T', 'P', 'P', 'T', 'P' };
        int k2 = 2;

        System.out.println("Output 1: " + catchThieves(arr1, k1)); // Expected: 2
        System.out.println("Output 2: " + catchThieves(arr2, k2)); // Expected: 3
    }
}
