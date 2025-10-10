//Given an array of integers nums and an integer k, 
//return the total number of subarrays whose sum equals to k.

import java.util.*;
class Solution{
    static int sumEqualsK(int[]arr,int n,int k)
    {
       int count=0;
       for(int i=0;i<n;i++)
       {
         int sum=0;
         for(int j=i;j<n;j++)
         {
              int num=arr[j];
              sum=sum+num;
              if(sum==k)
              {
                count++;
              }
         }
       }
       return count;
    }
}
public class SubArraySumEqualsK {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter value of k");
                            int k=sc.nextInt();
                            System.out.println("Number of Subarray which sum equals k = "+Solution.sumEqualsK(arr,n,k));
                            sc.close();
                         }
                         
}
