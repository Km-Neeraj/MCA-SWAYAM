import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
public class BinarySearch
{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = obj.search(nums, target);
        System.out.println(result);
    }
}
