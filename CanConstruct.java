class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0)
                return false;
        }
        return true;
    }
}

public class CanConstruct {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String ransomNote = "aa";
        String magazine = "aab";

        boolean result = obj.canConstruct(ransomNote, magazine);
        System.out.println(result);
    }
}
