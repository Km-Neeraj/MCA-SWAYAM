class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < k; i++) {
            res.append(words[i]);
            if (i < k - 1) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}

public class TruncateSentence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "Hello how are you Contestant";
        int k = 4;

        String result = obj.truncateSentence(s, k);
        System.out.println(result);
    }
}

                         

