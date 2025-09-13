import java.util.*;
class Solution 
{
   static int thirdLargest(int[]arr,int n)
   {
       Arrays.sort(arr);
       return arr[n-3];
   }
}
public class ThirdLargest {
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
                            int thirdLargest=Solution.thirdLargest(arr,n);
                           System.out.println("Third Largest Element = "+thirdLargest);
                           sc.close();
                         }
                         
}
