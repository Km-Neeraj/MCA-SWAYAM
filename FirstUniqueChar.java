import java.util.*;
class Solution 
{
    static char firstUniqueChar(String s)
    {
       int len=s.length();
       for(int i=0;i<len;i++)
       {
           boolean res=true;
           for(int j=0;j<len;j++)
           {
              if(i!=j&&s.charAt(i)==s.charAt(j))
              {
              res=false;
              break;
              }

           }
           if(res)
           {
              return s.charAt(i);
           }
       }
       return '\0';
    }
}
public class FirstUniqueChar {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             char ch=Solution.firstUniqueChar(s);
                             System.out.println("First Unique character is = "+ch);
                             sc.close();
                         }
                         
}
