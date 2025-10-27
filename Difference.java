

class Solution {
    public char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0)
                return (char) (i + 'a');
        }
        return ' ';
    }
}

public class Difference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        Solution obj = new Solution();
        char result = obj.findTheDifference(s, t);
        System.out.println("The extra character is: " + result);
    }
}

                         

