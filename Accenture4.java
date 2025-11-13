import java.util.*;
class Solution 
{
    static int solve(int[]arr,int n,int num,int diff)
    {
                         int count=0;
         for(int i=0;i<n;i++)
         {
        if(Math.abs(num-arr[i])<=diff)
        count++;
         }
         if(count>0)
         return count;
         else 
           return -1;
    }
}
public class Accenture4 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int []arr=new int[n];
                             System.out.println("Enter Array elements");
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             System.out.println("Enter number");
                             int num=sc.nextInt();
                             System.out.println("Enter Difference");
                             int diff=sc.nextInt();
                   System.out.println(Solution.solve(arr,n,num,diff));
                   sc.close();
                         }
                         
}
