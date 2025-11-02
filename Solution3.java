import java.util.*;
class Solution 
{
   static int result(int[]arr,int n)
   {
       int res=arr[0];
       int max=arr[0];

       for(int i=1;i<n;i++)
       {
         max=Math.max(max+arr[i],arr[i]);
         res=Math.max(max,res);
       }
       return res;
   }
}
public class Solution3 {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int max=Solution.result(arr,n);
                            System.out.println(max);
                            sc.close();

                         }
                         
}
