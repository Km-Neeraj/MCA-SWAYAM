/*  The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer 
array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in 
an area, ‘unit’ is the amount of food each rat consumes and each ith element of array
 ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i */
import java.util.*;
class Solution{
       static int solve(int rat,int unit,int[]arr,int n)
       {
           if(n==0)
           return -1;
          int total_food=rat*unit;
          int sum=0;

          for(int i=0;i<n;i++)
          {
             sum=sum+arr[i];
             if(sum>=total_food)
             {
                 return i+1;
             }

          }
          
      return 0;

       }
}
 public class Accenture1 {
                         public static void main(String[] args) {
                                                  
                              int n;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter n");
                              n=sc.nextInt();
                              int[]arr=new int[n];
                              System.out.println("Enter Array elements");
                              for(int i=0;i<n;i++)
                              {
                                 arr[i]=sc.nextInt();
                              }
                              System.out.println("Enter unit");
                              int unit=sc.nextInt();
                              System.out.println("Enter Rat numbers");
                              int rat=sc.nextInt();
                              System.out.println(Solution.solve(rat,unit,arr,n));
                              sc.close();
                         }
                         
}
