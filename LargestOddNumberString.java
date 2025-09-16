import java.util.*;
class Solution 
{
   static String largestOddNum(String s)
   {
       for(int i=s.length()-1;i>=0;i--)
       {
          if(s.charAt(i)%2!=0)
          {
              String s1=s.substring(0,i+1);
              return s1;

          }
       }
       return " ";
   }
}
public class LargestOddNumberString {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            String res=Solution.largestOddNum(s);
                            if(res==" ")
                            System.out.println("Longest Odd num is not present");
                            else
                            System.out.println("Largest Odd Number in String = "+res);
                            sc.close();
                         }
                         
}
