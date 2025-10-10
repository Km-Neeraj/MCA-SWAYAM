//Given an array of integers nums and an integer k, return the number of
 //contiguous subarrays where the product of all the elements in the subarray
 //is strictly less than k.
 import java.util.*;
 class Solution 
 {
    static int maxProduct(int[]arr,int n,int k)
    {
       int count=0;
       for(int i=0;i<n;i++)
       {
          int p=1;
          for(int j=i;j<n;j++)
          {
              int num=arr[j];
              p=p*num;
              if(p<k)
              {
                count++;
              }
              else 
              {
                 break;
              }
          }
       }
       return count;
       
    }
 }
public class SubArrayProductLessK {
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
                            System.out.println("Number of contiguous subarrays which product less than k = "+Solution.maxProduct(arr,n,k));
                            sc.close();
                         }
                         
}
