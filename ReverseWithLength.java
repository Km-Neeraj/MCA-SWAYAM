import java.util.*;
class Solution 
{
                         
   static String result(String s)
   {
                         StringBuilder res2=new StringBuilder();
     String[]ch=s.split("\\s+");
     for(int i=0;i<ch.length;i++)
     {
        String w=ch[i];
        String count=""+w.length();
        StringBuilder res=new StringBuilder(w);
        
        res.reverse();
        res2.append(res);
        res2.append(count);
        if(i<ch.length)
        {
                         res2.append(" ");
        }

     }
     return res2.toString();
   }
}
public class ReverseWithLength {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             String s=sc.nextLine();
                             String res=Solution.result(s);
                             System.out.println("Result = "+res);
                             sc.close();
                         }
                         
}
