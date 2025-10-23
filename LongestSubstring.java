import java.util.HashSet;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) break;
                set.add(s.charAt(j));
                res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LongestSubstring
         sol = new LongestSubstring();
        String s = "abbacsdfg";
        System.out.println(sol.lengthOfLongestSubstring(s));
    }
}

                         

