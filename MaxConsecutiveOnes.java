// Maximum Consecutive Ones 
import java.util.*;
class Solution 
{
    static int maxConsecutiveOnes(int[]arr,int n)
    {
           int count=0;
           int maxCount=0;
         //Arrays.sort(arr);
         for(int i=0;i<n;i++)
         {
             if(arr[i]==1)
             {
                
                count++;
                 maxCount=Math.max(maxCount,count);
             }
             else 
             {
                
               
                count=0;
             }
         }
         return maxCount;
    }
}


public class MaxConsecutiveOnes {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter the an array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int max=Solution.maxConsecutiveOnes(arr,n);
                            System.out.println("Maximum Consecutive Ones = "+max);
                            sc.close();

                         }
                         
}
