import java.util.*;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                res ^= nums[i];
                i++;
            }
        }
        return res;
    }
}

public class DuplicateNumXor {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        Solution obj = new Solution();
        int result = obj.duplicateNumbersXOR(nums);
        System.out.println(result);
    }
}

                         

