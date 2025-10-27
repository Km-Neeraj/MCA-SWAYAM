

import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1, missing = -1;
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.contains(nums[i]))
                duplicate = nums[i];
            else
                res.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!res.contains(i))
                missing = i;
        }
        return new int[]{duplicate, missing};
    }
}

public class FindMissingDuplicate{
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        Solution obj = new Solution();
        int[] result = obj.findErrorNums(nums);
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}

                         

