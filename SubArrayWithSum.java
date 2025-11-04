import java.util.*;
class Solution 
{
   static int maxLength(int[]arr,int n,int k)
   {
      int res=0;
      for(int i=0;i<n;i++)
      {
          int sum=0;
          for(int j=i;j<n;j++)
          {
              sum=sum+arr[j];
             if(sum==k)
             {
                 int len=j-i+1;
                 res=Math.max(res,len);
             }
          }
      }
      return res;
   }
}
public class SubArrayWithSum {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter value of sum");
                            int k=sc.nextInt();

                            int len=Solution.maxLength(arr,n,k);
                            System.out.println("Maximum length of subarray with sum = "+len);
                            sc.close();
                         }
                         
}
