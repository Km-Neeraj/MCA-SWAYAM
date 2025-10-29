class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2 * nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            res[j++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            res[j++] = nums[i];
        }
        return res;
    }
}

public class ConcatenateArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3};
        int[] result = s.getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

                         

