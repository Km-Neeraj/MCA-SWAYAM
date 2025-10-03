import java.util.*;
class Solution 
{
     static String reverse(String s)
     {
         String res="";
         for(int i=0;i<s.length();i++)
         {
            char ch=s.charAt(i);
            res=ch+res;
         }
         return res;
     }
}
public class ReverseWords {
                         public static void main(String[]abc)
                         {
                              String s;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter String");
                              s=sc.next();
                              System.out.println("String After Reverse = "+Solution.reverse(s));
                              sc.close();
                         }
                         
}
