import java.util.*;
class Solution 
{
   static int result(String[]arr,int n)
   {
      int count=0;
      for(int i=0;i<n;i++)
      {
         String res=arr[i];
         int age=0;
         for(int j=11;j<=12;j++)
         {
            int num=res.charAt(j)-'0';
            age=age*10+num;
         }
         if(age>60)
         {
          count++;
         }
      }
      return count;
   }
}
public class NumberOfSeniorCitizen {
                         public static void main(String[] args) {
                                                  
                           Scanner sc=new Scanner(System.in);
                           int n=sc.nextInt();
                           String[]arr=new String[n];
                           for(int i=0;i<n;i++)
                           {
                              arr[i]=sc.next();
                           }
                           int res=Solution.result(arr,n);
                           System.out.println("Result = "+res);
                           sc.close();
                         }
                         
}
