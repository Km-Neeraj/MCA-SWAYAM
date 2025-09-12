//    Contains Duplicate 
import java.util.*;
class Solution 
{
   static boolean isContainsDuplicate(int[]arr,int n)
   {
       for(int i=1;i<n;i++)
       {
          if(arr[i]==arr[i-1])
          return true;
       }
       return false;
   }
}

public class ContainsDuplicate {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                         int[]arr=new int[n];
                         System.out.println("Enter Array elements");
                         for(int i=0;i<n;i++)
                         {
                             arr[i]=sc.nextInt();
                         }
                         if(Solution.isContainsDuplicate(arr,n))
                         {
                             System.out.println("Yes");
                         }
                         else{
                                  System.out.println("No");
                         }
                         sc.close();
                         }
                         
}
