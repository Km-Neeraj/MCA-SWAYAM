import java.util.*;
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;

        int n = s1.length();
        List<Integer> diff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diff.add(i);
            }
        }

        if (diff.size() != 2) return false;

        int i = diff.get(0), j = diff.get(1);
        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
}

public class CheckEqualStrings {

                         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Solution obj = new Solution();
        System.out.println(obj.areAlmostEqual(s1, s2));
    }
                         
}
