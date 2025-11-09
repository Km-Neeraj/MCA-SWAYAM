class Solution {
    public int countCharacters(String[] words, String chars) {

        int[] freq = new int[26]; 
        for (char c : chars.toCharArray()) {
            freq[c - 'a']++;
        }

        int totalLength = 0;

        for (String word : words) {
            int[] temp = freq.clone(); 
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                temp[c - 'a']--;
                if (temp[c - 'a'] < 0) {
                    canForm = false; 
                    break;
                }
            }

            if (canForm) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }
}

public class CountCharacters {
    public static void main(String[] args) {
        Solution obj = new Solution();
        
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        
        int result = obj.countCharacters(words, chars);
        System.out.println(result);
    }
}

                         

