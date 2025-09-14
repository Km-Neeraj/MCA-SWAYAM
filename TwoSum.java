import java.util.*;
class Solution 
{
   static boolean twoSum(int[]arr,int n,int target)
   {
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<n;i++)
        {
           int c=target-arr[i];
           if(res.contains(c))
           return true;
           res.add(arr[i]);
        }
        return false;
   }
}
public class TwoSum {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter target Value");
                            int target=sc.nextInt();

                            if(Solution.twoSum(arr,n,target))
                            {
                               System.out.println("true");
                            }
                            else 
                            {
                               System.out.println("false");
                            }
                            sc.close();
                         }
                         
}
