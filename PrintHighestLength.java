import java.util.*;
class Solution 
{
   static int result(String arr[],int n)
   {
      int max=0;
      for(String ch:arr)
                         {
                             int res=0;
                             for(int i=0;i<ch.length();i++)
                             {
                                res++;
                             }
                             if(res>max)
                             {
                                max=res;
                             }
                         } 
                         return max;
   }
}
public class PrintHighestLength {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            String[]arr=new String[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.next();
                            }
                            int res=Solution.result(arr,n);
                            System.out.println("Result = "+res);
                            sc.close();

                         }
                         
}
