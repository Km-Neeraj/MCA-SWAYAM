import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBysign {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int n = nums.length;
        
        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }
        
        int posIdx = 0, negIdx = 0;
        int[] res = new int[n];
        
        // Alternate placement: positive at even index, negative at odd index
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                res[i] = pos.get(posIdx++);
            } else {
                res[i] = neg.get(negIdx++);
            }
        }
        return res; 
    }

    public static void main(String[] args) {
        RearrangeBysign sol = new RearrangeBysign(); 
        
        // Example input
        int[] nums = {3, 1, -2, -5, 2, -4};
        
        int[] result = sol.rearrangeArray(nums);
        
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
