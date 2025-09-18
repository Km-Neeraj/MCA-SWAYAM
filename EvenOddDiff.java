import java.util.*;

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxOdd = 0;
        int minEven = 101;
        for (int f : freq) {
            if (f > 0) {
                if (f % 2 == 1) {
                    if (f > maxOdd) maxOdd = f;
                } else {
                    if (f < minEven) minEven = f;
                }
            }
        }
        return maxOdd - minEven;
    }
}

public class EvenOddDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution sol = new Solution();
        System.out.println(sol.maxDifference(s));
        sc.close();
    }
}
