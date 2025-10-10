
import java.util.*;
class Solution 
{
   static int maxSum(int[]arr,int n)
   {
      int res=arr[0];
      for(int i=0;i<n;i++)
      {
         int c=0;
         for(int j=i;j<n;j++)
         {
           c=c+arr[j];
           res=Math.max(res,c);
         }
      }
      return res;
   }
}
public class maximumSubArrayNaive {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             System.out.println("Enter Array elements");
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             System.out.println("Maximyum SubArray = "+Solution.maxSum(arr,n));
                             sc.close();
                         }
                         
}
