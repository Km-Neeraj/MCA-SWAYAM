import java.util.Arrays;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int mv = 0;
        for (int i = 0; i < seats.length; i++) {
            int d = seats[i] - students[i];
            if (d < 0) d = -d;  
            mv += d;
        }

        return mv;
    }
}

public class MinNumMove {
    public static void main(String[] args) {
        Solution sol = new Solution();


        int[] seats1 = {3, 1, 5};
        int[] students1 = {2, 7, 4};
        System.out.println("Minimum moves : " + sol.minMovesToSeat(seats1, students1));

        }
}

                         

