public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        boolean[] seen = new boolean[26];
        int count = 0;
        for (char c : s.toCharArray()) {
            if (!seen[c - 'a']) {
                seen[c - 'a'] = true;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinimizeStringLength obj = new MinimizeStringLength();
        System.out.println(obj.minimizedStringLength("cbbd"));
        System.out.println(obj.minimizedStringLength("aaabc"));
        System.out.println(obj.minimizedStringLength("abc"));
    }
}
