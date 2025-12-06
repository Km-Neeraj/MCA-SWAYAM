import java.util.*;
class Solution 
{
   static int result(int n)
   {
      for(int i=1;;i++)
      {
         int digit=0;
         int temp=i;
         int x=temp;
         while(x>0)
         {
               digit++;
               x/=10;          
         }
         if(digit!=n)
                         continue;
          int sum=0;
          x=temp;
          while(x!=0)
          {
             int rem=x%10;
             sum=sum+(int)Math.pow(rem,n);
             x/=10;

          }
          if(sum==temp)
             return temp;
      }

   }
}
public class ArmstrongDigit {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int res=Solution.result(n);
                            System.out.println("output = "+res);
                            sc.close();
                         }
                         
}
