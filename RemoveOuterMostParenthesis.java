//Remove OuterMost Parenthesis like if (()())()(()) then output should be ()()()
import java.util.*;
class Solution 
{
    static String remove(String s)
    {
       String res="";
       int c=0;
       for(int i=0;i<s.length();i++)
       {
          char ch=s.charAt(i);
          if(ch=='('&&c++>0)
          res+=ch;
          if(ch==')'&&c-->1)
          res+=ch;
       }
       return res;
    } 
}
public class RemoveOuterMostParenthesis {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Parenthesis");
                             s=sc.next();
                             System.out.println("String After Removing outer Parenthesis ="+Solution.remove(s));
                             sc.close();
                         }
                         
}
