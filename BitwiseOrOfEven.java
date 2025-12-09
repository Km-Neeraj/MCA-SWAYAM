import java.util.*;
class Solution 
{
   static int bitwiseOfAllEven(int[]arr,int n)
   {
      int sum=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]%2==0)
        {
           sum=sum | arr[i];

        }
      }
      return sum;
   }
}
public class BitwiseOrOfEven {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             int res=Solution.bitwiseOfAllEven(arr,n);
                             System.out.println("Result = "+res);
                             sc.close();
                         }
                         
}
