import java.util.*;
class Solution 
{
   static char result(String s,String t)
   {
      char res=0;
      for(int i=0;i<s.length();i++)
      {
                         res ^=s.charAt(i);
      }
      for(int i=0;i<t.length();i++)
      {
         res^=t.charAt(i);
      }
      return res;

   }
}
public class Difference {
                         public static void main(String[] args) {
                                                  
                         Scanner sc=new Scanner(System.in);
                         String s=sc.next();
                         String t=sc.next();
            char res=Solution.result(s,t);
            System.out.println("Difference = "+res);
            sc.close();
                         }
                         
}
