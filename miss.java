import java.util.*;
class Solution 
{
   static int missing(int[]arr,int n)
   {
      int nw_lngth=n+1;
      int xr1=0,xr2=0;
      for(int i=1;i<=nw_lngth;i++)
      {
           xr1=xr1^i;              
      }
      for(int i=0;i<n;i++)
      {
         xr2=xr2^arr[i];
      }
      int m=xr1^xr2;
      return m;
   }
}
public class miss {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int miss=Solution.missing(arr,n);
                            System.out.println("Missimg number = "+miss);
                            sc.close();
                         }
                         
}
