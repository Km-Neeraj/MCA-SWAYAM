import java.util.*;
class Solution{
     static int oneNum(int[]arr,int n)
     {
        int xr=0;
        for(int i=0;i<n;i++)
        {
          xr=xr^arr[i];
        }
        return xr;
     }
}
public class Num1 {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int one=Solution.oneNum(arr,n);
                            System.out.println("ONe Number = "+one);
                            sc.close();


                         }
                         
}
