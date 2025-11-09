import java.util.*;
class Solution 
{
   static boolean result(int[]arr,int n,int target)
   {
      Arrays.sort(arr);
      int left=0,right=n-1;
      while(left<right)
      {
         int sum=arr[left]+arr[right];
         if(sum==target)
         return true;
         else if(sum<target)
         left++;
         else 
         right--;
      }
      return false;
   }
}
public class twoSum1 {
  
                          public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array elements ");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                         }
                         System.out.println("Enter Target value");
                         int target=sc.nextInt();
                         boolean res=Solution.result(arr,n,target);
                         if(res)
                         {
                            System.out.println("Yes two Exist");
                         }
                         else 
                         {
                             System.out.println("No two sum not exist");
                         }
                         sc.close();
 }
                         
}
