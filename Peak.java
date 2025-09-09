//Find peak Element in array a peak element is an elemnt that is strictly greater of its adjacent element
import java.util.*;
class Solution 
{
    static int peakElement(int[]arr,int n)
    {
                         if(n==1)
                         {
                                                  return arr[0];
                         }
                         if(arr[n-1]>arr[n-2])
                         {
                                                  return arr[n-1];
                         }
        int low=1;
        int high=n-2;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
            {
                         return arr[mid];
            }
            else if(arr[mid]<arr[mid+1])
            {
                         low=mid+1;
            }
            else 
            {
                high=mid-1;
            }

        }
        return 0;
    }
}
public class Peak {
                         public static void main(String[]abc)
                         {
                                                  int n;
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("Enter Size of an Array ");
                                                  n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  System.out.println("Enter an array elements");
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.nextInt();
                                                  }
                                                  int res=Solution.peakElement(arr,n);
                                                  if(res!=0)
                                                  System.out.println("Peak element = "+res);
                                                  else 
                                                  System.out.println("Peak element is not present ");
                                                  sc.close();
                         }
                         
}
