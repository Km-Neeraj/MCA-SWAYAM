import java.util.*;
class Solution 
{
   static int majority(int[]arr,int n)
   {
        int c=-1;
        int count=0;
        for(int num:arr)
        {
           if(count==0)
           {
             c=num;
             count++;
           }
           else if(num==c)
           {
                         count++;
           }
           else 
           {
                         count--;
           }
        }
        int c1=0;
        for(int num:arr)
        {
           if(num==c)
           c1++; 
        }
        if(c1>n/2)
        return c;
        else 
        return -1;
   }
}
public class MooreVoting {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter an Array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int res=Solution.majority(arr,n);
                            if(res!=(-1))

                            System.out.println("Majority element = "+res);
                            else 
                            System.out.println("Majority element is not present");
                            sc.close();
                         }
                         
}
