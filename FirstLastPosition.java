//    Find First and Last Position of Element in Sorted Array (Binary Search problem) 
import java.util.*;
class Base 
{
     static int firstPosition(int[]arr,int n,int x)
     {
        int low=0;
        int high=n-1;
        int first=-1;
        while(low<=high)
        {
             int mid=(low+high)/2;
             if(arr[mid]==x)
             {
                 first=mid;
                 high=mid-1;
             }
             else if(x<arr[mid])
             {
               high=mid-1;
             }
             else 
             {
                         low=mid+1;
             }
        }
        return first+1;
     }
     static int lastPosition(int[]arr,int n,int x)
     {
         int low=0;
         int high=n-1;
         int last=-1;
         while(low<=high)
         {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
               last=mid;
               low=mid+1;
            }
            else if(x<arr[mid])
            {
             high=mid-1;
            }
            else
            {
               low=mid+1;
            }
         }
         return last+1;
     }
}
class Solution 
{
     static ArrayList<Integer> firstLastPosition(int[]arr,int n,int x)
     {
         int first=Base.firstPosition(arr,n,x);
         int last=Base.lastPosition(arr,n,x);
         ArrayList<Integer> res=new ArrayList<>();
         res.add(first);
         res.add(last);
         return res;
     }
}
public class FirstLastPosition {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the size of An Array");
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             System.out.println("Enter array elements");
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             System.out.println("Enter element to find its first and last position");
                             int x=sc.nextInt();
                             ArrayList<Integer> res=Solution.firstLastPosition(arr,n,x);
                             System.out.print("First and last position of "+x +" = ");
                             System.out.println(res.get(0)+" "+res.get(1));
                             sc.close();

                         }
                         
}
