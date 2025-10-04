import java.util.*;
class Solution 
{
    static void max(int[]arr, int n)
    {
       int m=arr[0],idx=0;
       for(int i=1;i<n;i++)
       {
          if(arr[i]>m)
          {
           m=arr[i];
           idx=i;

          }
       }
       System.out.print(m+" ");
       System.out.print(idx);
    }
}
public class MaximumValueIndex {
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
                             Solution.max(arr,n);
                             sc.close();
                         
                         }
                         
                         
}
