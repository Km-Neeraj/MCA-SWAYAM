

class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String haystack = "sadbutsad";
        String needle = "sad";

        int result = obj.strStr(haystack, needle);


        System.out.println("The index of the first occurrence: " + result);
    }
}

