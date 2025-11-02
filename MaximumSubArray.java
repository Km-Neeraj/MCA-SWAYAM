import java.util.*;
class Solution 
{
   static int result(int[]arr,int n)
   {
     
       int res=arr[0];
       for(int i=0;i<n;i++)
       {
         int currSum=0;
         for(int j=i;j<n;j++)
         {
            currSum=currSum+arr[j];
            res=Math.max(currSum,res);
         }
       }
       return res;
   }
}
public class MaximumSubArray {
                         public static void main(String[] args) {
                                                  
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             int res=Solution.result(arr,n);
                             System.out.println("Maximum SubArray "+res);
                             sc.close();

                         }
                         
}
