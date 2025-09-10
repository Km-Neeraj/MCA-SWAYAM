//check automorphic
import java.util.*;
class Solution 
{
   static boolean isAutomorphic(int n)
   {
       int temp=n;
       int r=n*n;
       int count=0;
       while(n!=0)
       {
         count++;
         n=n/10;
       }
       int res=r%(int)Math.pow(10,count);
       if(res==temp)
       return true;
   return false;
   }
   
}
public class isAutomorphic {
                         public static void main(String[]abc)
                         {
                           int n;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter number to check automorphic or not");
                           n=sc.nextInt();
                           boolean res=Solution.isAutomorphic(n);
                           if(res)
                           {
                              System.out.println(n+" is an automorphic");
                           }
                           else 
                           {
                               System.out.println(n+" is not an automorphic");
                           }
                           sc.close();
                         }
                         
}
