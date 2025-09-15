import java.util.*;
class Solution 
{
    static boolean sum3(int[]arr,int n,int target)
    {
         for(int i=0;i<n-2;i++)
                           {
                               int l=i+1,hi=n-1;
                               int sum=target-arr[i];
                               while(l<hi)
                               {
                                   if(arr[l]+arr[hi]==sum)
                                   return true;
                                   if(arr[l]+arr[hi]<sum)
                                   l++;
                                   if(arr[i]+arr[l]>sum)
                                   hi--;
                               }
                           }
                           return false;

    }
}
public class Sum3 {
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
                           int target=13;
                           boolean res=Solution.sum3(arr,n,target);
                            if(res)
                            {
                               System.out.println("Yes 3sum is present");
                            }
                            else 
                            {
                               System.out.println("No 3Sum is not present");
                            }
                           
                               sc.close();
                         }
                           
                         
                         
}
