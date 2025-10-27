import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i = i + 3) {
            if (nums[i] != nums[i + 1])
                return nums[i];
        }
        return nums[nums.length - 1];
    }
}

public class SingleNumIII {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        Solution obj = new Solution();
        int result = obj.singleNumber(nums);
        System.out.println(result);
    }
}

                         

