import java.util.*;
class Solution 
{
   static int[]result(int[]arr,int n)
   {
      int[]res=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
         sum=sum+arr[i];
         res[i]=sum;
      }
      return res;
   }
}
public class RunningSum1Array {

                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            int[]res=Solution.result(arr,n);
                            for(int i=0;i<res.length;i++)
                            {
                                System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
