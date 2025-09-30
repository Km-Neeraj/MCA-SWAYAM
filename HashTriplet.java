import java.util.*;
class Solution 
{
    static boolean hasTriplet(int[]arr,int n,int target)
    {
         Arrays.sort(arr);
         for(int i=0;i<n-2;i++)
         {
            int l=i+1,r=n-1;
            int sum=target-arr[i];
            while(l<r)
            {
                if(arr[l]+arr[r]==sum)
                return true;
                if(arr[l]+arr[r]<sum)
                l++;
                if(arr[l]+arr[r]>sum)
                r--;
            }
         }
         return false;
    }
}
public class HashTriplet {
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
                             System.out.println("Enter target");
                             int target=sc.nextInt();
                             boolean res=Solution.hasTriplet(arr,n,target);
                             if(res)
                             System.out.println("Triplet Exists");
                             else
                             System.out.println("Triplet not exist");
                             sc.close();
                         }
                         
}

                         

