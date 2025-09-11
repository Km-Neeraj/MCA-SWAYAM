//Number of Set Bit
import java.util.*;
class Solution 
{
     static int numberOfSetBit(int n)
     {
        int c=0;
        while(n>0)
        {
             n=n&(n-1);
             c++;
        }
        return c;
     }
}
public class CountSetBit {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter Number");
                            n=sc.nextInt();
                            int res=Solution.numberOfSetBit(n);
                            System.out.println("Number of set bit = "+res);
                            sc.close();
                         }
                         
}
