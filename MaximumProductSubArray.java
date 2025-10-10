//Given an integer array nums, find a subarray that has the largest product,
// and return the product.
import java.util.*;
class Solution 
{
   static int subArrayProduct(int[]arr,int n)
   {
      int res=arr[0];
      int maxProduct=arr[0];
      int minProduct=arr[0];
      for(int i=1;i<n;i++)
      {
         int num=arr[i];
         if(num<0)
         {
             int t=maxProduct;
             maxProduct=minProduct;
             minProduct=t;
         }
         maxProduct=Math.max(num,maxProduct*num);
         minProduct=Math.min(num,minProduct*num);
         res=Math.max(res,maxProduct);
      }
      return res;
   }
}
public class MaximumProductSubArray {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter an array elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            System.out.println("Largest Product of Subarray = "+Solution.subArrayProduct(arr,n));
                            sc.close();
                         }
                         
}
