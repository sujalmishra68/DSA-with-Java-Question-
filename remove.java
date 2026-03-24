class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // unique index

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
 public class remove {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = solution.removeDuplicates(nums);
        
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }}