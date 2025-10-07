import java.util.*;
class Solution 
{
   static void sort012(int[]arr,int n)
   {
       int l=0;
       int hi=n-1;
       int mid=0;

       while(mid<=hi)
       {
          if(arr[mid]==0)
          {
             int temp=arr[l];
             arr[l++]=arr[mid];
             arr[mid++]=temp;
          }
          else if(arr[mid]==1)
          mid++;
          else 
          {
             int temp=arr[mid];
             arr[mid]=arr[hi];
             arr[hi--]=temp;
          }
       }
       
   }
}
public class DutchNationalFlag {
public static void main(String[] args) {
                         
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    n=sc.nextInt();
    System.out.println("Enter An array elements only 0 1 and 2");
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();

    }
    Solution.sort012(arr,n);
    System.out.println("Array Elements after sorting in 0 1 and 2 ");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
}
                         
}
