class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String s : operations) {
            if (s.contains("+")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}

public class FinalValue {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] operations = {"X++", "++X", "--X", "X--"};
        int result = s.finalValueAfterOperations(operations);
        System.out.println(result);
    }
}

                         

