import java.util.*;
class Solution 
{
    static int solve(String s)
    {
       if(s==null)
       return -1;
       int res=s.charAt(0)-'0';
       for(int i=1;i<s.length();i++)
       {
         char prev=s.charAt(i);
         i++;
         if(prev=='A')
         {
            res=res & (s.charAt(i)-'0');
         }
         else if(prev=='B')
         res=res | (s.charAt(i)-'0');
       else if(prev=='C')
       res=res ^(s.charAt(i)-'0');
    
       }
    return res;
    }
}
public class Accenture2 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             String s;
                             s=sc.next();
                             System.out.println(Solution.solve(s));
                             sc.close();
                         }
                         
}
