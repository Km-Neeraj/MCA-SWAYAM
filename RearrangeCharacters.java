
class Solution {
    public int rearrangeCharacters(String s, String target) {

        int[] freqS = new int[26];
        int[] freqT = new int[26];

        for (char ch : s.toCharArray())
            freqS[ch - 'a']++;

        for (char ch : target.toCharArray())
            freqT[ch - 'a']++;

        int minCopies = Integer.MAX_VALUE;

        for (char ch : target.toCharArray()) {
            int idx = ch - 'a';
            if (freqT[idx] > 0)
                minCopies = Math.min(minCopies, freqS[idx] / freqT[idx]);
        }

        return minCopies;
    }
}

public class RearrangeCharacters {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String s = "ilovecodingonleetcode";
        String target = "code";

        int result = obj.rearrangeCharacters(s, target);
        System.out.println(result);
    }
}

                         

