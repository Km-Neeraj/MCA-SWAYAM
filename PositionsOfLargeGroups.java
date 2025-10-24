import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int n = s.length();
        int start = 0;

        for (int i = 1; i <= n; i++) {
            if (i == n || s.charAt(i) != s.charAt(start)) {
                int len = i - start;
                if (len >= 3) {
                    res.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }

        return res;
    }
}

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        String s = "abbxxxxzzy";  // Hardcoded input

        Solution solution = new Solution();
        List<List<Integer>> groups = solution.largeGroupPositions(s);

        System.out.println("Positions of large groups:");
        for (List<Integer> group : groups) {
            System.out.println(group);
        }
    }
}

                         

