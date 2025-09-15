import java.util.*;
public class LongestConsecutive
{
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

        int res=1,count=1;
        for(int i=1;i<n;i++)
        {
           if(arr[i]==arr[i-1])
           continue;
           if(arr[i]==arr[i-1]+1)
           count++;
           else 
           count=0;
           res=Math.max(res,count);
        }
        System.out.println("Maximum Consecutive = "+res);
        sc.close();
      }
}