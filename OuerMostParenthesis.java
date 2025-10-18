import java.util.*;
class Solution 
{
   static String remove(String s)
   {
      int openCount=0;
      int closeCount=0;
      int s1=0;
      String res="";
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch=='(')
          {
                         openCount++;
          }
          if(ch==')')
          {
             closeCount++;
          }
          if(openCount==closeCount)
          {
              res+=s.substring(s1+1,i);
              s1=i+1;
          }
      }
      return res;
   }
}
public class OuerMostParenthesis {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                            String res= Solution.remove(s);
                            System.out.println("Result = "+res);
                             sc.close();
                         }
                         
}
