import java.util.*;

class Solution {
    public int minDeletion(String s, int k) {
        int[] f = new int[26];
        for (char c : s.toCharArray()) {
            f[c - 'a']++;
        }

        List<Integer> res = new ArrayList<>();
        for (int f1 : f) {
            if (f1 > 0) res.add(f1);
        }

        if (res.size() <= k) return 0;

        Collections.sort(res);

        int del = 0;
        int remove = res.size() - k;

        for (int i = 0; i < remove; i++) {
            del += res.get(i);
        }

        return del;
    }
}

public class MinimumDeletions {
    public static void main(String[] args) {
        String s = "aaabbc"; 
        int k = 2;             

        Solution solution = new Solution();
        int result = solution.minDeletion(s, k);

        System.out.println("Minimum deletions needed: " + result);
    }
}

                         

