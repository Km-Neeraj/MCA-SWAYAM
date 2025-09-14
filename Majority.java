import java.util.*;
class Solution 
{
    static int majority(int[]arr)
    {
                         int count=0;
                         int candidate=0;

          for(int n:arr)
          {
              if(count==0)
              {
                  candidate=n;
                  count=1;
              }
              else if(candidate==n)
              count++;
              else 
              {
                         count--;
              }
          }
          count=0;
          for(int n:arr)
          {
              if(n==candidate)
              count++;
          }
          if(count>arr.length/2)
          return candidate;
       return -1;   
    }
}
public class Majority {
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
                            int res=Solution.majority(arr);
                            if(res==-1)
                            {
                               System.out.println("Majority element is not present");

                            }
                            else 
                            {
                                 System.out.println("Majority element = "+res);
                            }
                            sc.close();
                         }
                         
}
