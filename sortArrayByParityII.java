import java.util.*;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int i = 0;
        int j = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[i] = num;
                i += 2;
            } else {
                arr[j] = num;
                j += 2;
            }
        }
        return arr;
    }
}
public class sortArrayByParityII{
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {4, 2, 5, 7};  // Example input
        int[] result = sol.sortArrayByParityII(nums);

        System.out.println("Sorted Array by Parity II: " + Arrays.toString(result));
    }
}

