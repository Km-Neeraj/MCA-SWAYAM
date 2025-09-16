import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length - 1];
        int minLength = Math.min(f.length(), l.length());
        int i = 0;
        while (i < minLength && f.charAt(i) == l.charAt(i))
            i++;
        return f.substring(0, i);
    }
}

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        Solution sol = new Solution();
        System.out.println(sol.longestCommonPrefix(strs));
    }
}

                         

