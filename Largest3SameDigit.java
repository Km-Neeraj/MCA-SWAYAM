

import java.util.*;
 class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String a = "";
        for (int i = 0; i <= n - 3; i++) {
            String r = num.substring(i, i + 3);
            if (r.charAt(0) == r.charAt(1) && r.charAt(1) == r.charAt(2)) {
                if (a.equals("") || r.compareTo(a) > 0) {
                    a = r;
                }
            }
        }
        return a;
    }
}

    public class Largest3SameDigit {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.largestGoodInteger("6777133339"));

    }
}


                         

