import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> ST = new HashMap<>();
        HashMap<Character, Character> TS1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);

            if (ST.containsKey(c)) {
                if (ST.get(c) != c1) return false;
            } else {
                ST.put(c, c1);
            }

            if (TS1.containsKey(c1)) {
                if (TS1.get(c1) != c) return false;
            } else {
                TS1.put(c1, c);
            }
        }

        return true;
    }
}

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";     
        String t = "add";    

        Solution solution = new Solution();
        boolean result = solution.isIsomorphic(s, t);

        System.out.println("Result = " + result);
    }
}


