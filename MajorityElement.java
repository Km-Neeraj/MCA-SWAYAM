import java.util.*;
class Solution 
{
   static int majority(int[]arr,int n)
   {
       Arrays.sort(arr);
       int candidate=arr[n/2];
       int c=0;
       for(int num:arr)
       {
          if(num==candidate)
          {
            c++;
          }
       }
       if(c>n/2)
       return candidate;
       else 
       return 0;
   }
}
public class MajorityElement {
                         public static void main(String[] args) {

                         int n;
                         Scanner sc=new Scanner(System.in);
                         n=sc.nextInt();
                         System.out.println("Enter Array Elements");
                         int[]arr=new int[n];
                         
                         for(int i=0;i<n;i++)
                         {
                             arr[i]=sc.nextInt();
                         }
                         int res=Solution.majority(arr,n);
                         System.out.println("Majority element = "+res);
                         sc.close();
                                                  
                         }
                         
}
