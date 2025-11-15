import java.util.*;
class Solution 
{
   static int countCarries(int num1,int num2)
   {
      int count=0;
      int temp1=num1;
      int temp2=num2;
      int rem=0;
      while(temp1 != 0 && temp2 != 0)
      {
          int d1=temp1%10;
          int d2=temp2%10;
        if((d1+d2+rem)>9)
        {
           count++;
           int sum=d1+d2+rem;
           rem=sum/10;
        }
        temp1/=10;
        temp2/=10;
      }
      while(temp1 !=0)
      {
         int d1=temp1%10;
         if((d1+rem)>9)
         {
            count++;
            int sum=d1+rem;
            rem=sum/10;
         }
     temp1/=10;
      }
         while(temp2 != 0)
         {
             int d2=temp2%10;
             if((d2+rem)>9)
             {
                count++;
                int sum=d2+rem;
                rem=sum/10;
             }
             temp2/=10;
         }
      
      return count;
   }
}
public class Accenture9 {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter two numbers");
                            int num1=sc.nextInt();
                            int num2=sc.nextInt();
      int res=Solution.countCarries(num1,num2);
      System.out.println("Number of Carries = "+res);
      sc.close();
                         }
                         
}
