import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (res.contains(nums[i]))
                return nums[i];
            else
                res.add(nums[i]);
        }
        return 0; 
    }
}

public class FindDuplicateMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int duplicate = obj.findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);
    }
}

                         

