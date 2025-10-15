import java.util.*;

public class maxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.maxProduct(n));
    }
}

class Solution {
    public int maxProduct(int n) {

        int c = 0;
        int temp = n;


        while (temp != 0) {
            temp = temp / 10;
            c++;
        }

        int[] res = new int[c];
        temp = n;

        int count=0;
        while(n!=0)
        {
           res[count++]=n%10;
           n=n/10;
        }

        int r = 0;


        for (int i = 0; i < c; i++) {
            for (int j = i + 1; j < c; j++) {
                int p = res[i] * res[j];
                if (p > r)
                    r = p;
            }
        }

        return r;
    }
}

                         

