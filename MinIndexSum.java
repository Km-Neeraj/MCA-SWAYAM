import java.util.*;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    int sum = i + j;
                    if (sum < minSum) {
                        res.clear();
                        res.add(list1[i]);
                        minSum = sum;
                    } else if (sum == minSum) {
                        res.add(list1[i]);
                    }
                }
            }
        }

        return res.toArray(new String[0]);
    }
}

public class MinIndexSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] result = sol.findRestaurant(list1, list2);
        System.out.println(Arrays.toString(result));
    }
}

                         

