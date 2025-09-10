//check is array is sorted in non-decreasing order or not
import java.util.*;
class Solution 
{
     static boolean isSorted(int[]arr,int n)
     {
                         
         for(int i=1;i<n;i++)
         {
            if(arr[i]<arr[i-1])
            return false;
         }
         return true;
     }
}
public class CheckArraySorted {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            System.out.println("Enter an array elements");
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();

                            }
                            boolean res=Solution.isSorted(arr,n);
                            if(res)
                            {
                               System.out.println("Array is sorted in non-decreasing order");
                            }
                            else 
                            {
                               System.out.println("Array is not sorted");
                            }
                            sc.close();
                         }
                         
}
