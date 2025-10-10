import java.util.*;
class Solution 
{
     static int kadensAlgorithm(int[]arr,int n)
     {
        int res=arr[0];
        int maxSum=arr[0];
       for(int i=1;i<n;i++)
       {
           int num=arr[i];
             maxSum=Math.max(num,maxSum+num);
             res=Math.max(res,maxSum);
       }
       return res;
     }
}
public class KadensAlgoMaxSum {

                         public static void main(String[] args) {
                                                  
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             System.out.println("Enter An Array elements");
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             System.out.println("Maximum sum Subarray "+Solution.kadensAlgorithm(arr,n));
                             sc.close();
                         }
                         
}
