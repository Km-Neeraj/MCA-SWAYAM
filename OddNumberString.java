import java.util.*;
class Solution 
{
   static int OddNum(String s)
   {
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          int d=ch-'0';
          if(d%2!=0)
          return d;
      }
      return 0;
   }
}
public class OddNumberString {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.next();
                         int res=Solution.OddNum(s);
                         System.out.println("Odd Number in String "+res);
                         sc.close();
                         }
                         
}
