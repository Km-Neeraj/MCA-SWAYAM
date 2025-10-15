import java.util.*;

public class largestSumAfterKNegations {
    public static void main(String[] args) {

        // Fixed input
        int[] nums = {2, -3, -1, 4};
        int k = 3;

        Solution obj = new Solution();
        int result = obj.largestSumAfterKNegations(nums, k);
        System.out.println("Largest sum after K negations: " + result);
    }
}

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);  // Step 1: sort array

        // Step 2: flip negative numbers
        for(int i = 0; i < nums.length && k > 0; i++) {
            if(nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            }
        }

        // Step 3: sort again to find smallest element
        Arrays.sort(nums);

        // Step 4: if k is odd, flip the smallest element
        if(k % 2 == 1) {
            nums[0] = -nums[0];
        }

        // Step 5: sum all elements
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }

        return sum;
    }
}

                         

