import java.util.*;

class Solution {
    static String uniqueChar(String s) {
        char[] ch = s.toCharArray();
        LinkedHashSet<Character> res = new LinkedHashSet<>();

        for (char r : ch) {
            int count = 0;
            for (char c : ch) {
                if (r == c) count++;
            }
            if (count == 1) res.add(r); 
        }

        String res1 = "";
        for (char ch1 : res)
            res1 = res1 + ch1;

        return res1;
    }
}

public class uniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = Solution.uniqueChar(s);
        System.out.println("Unique char = " + res);
        sc.close();
    }
}
