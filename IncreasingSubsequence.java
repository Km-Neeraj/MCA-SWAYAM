import java.util.*;
class Solution 
{
    static int result(int[]arr,int n)
    {
      int count=1;
      int max=1;
      for(int i=0;i<n-1;i++)
      {
         if(arr[i+1]>arr[i])
         count++;
         else 
         count=1;
          max=Math.max(max,count);
      }
      return max;
    }
}
public class IncreasingSubsequence {
                         public static void main(String[] args) {
                                                  
                             int num;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter size of an array");
                             num=sc.nextInt();
                             int[]arr=new int[num];
                             System.out.println("Enter array elements");
                             for(int i=0;i<num;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             int res=Solution.result(arr,num);
                             System.out.println("Output = "+res);
                             sc.close();
                         }
                         
}
