import java.util.*;
class Solution 
{
     static String reverse(String s)
     {
        String[]w=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=w.length-1;i>=0;i--)
        {
            res.append(w[i]);
            if(i>0)
            res.append(" ");
        }
        return res.toString();
     }
}
public class ReverseWordsII {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.nextLine();
                             System.out.println("Sentences after Reversing = "+Solution.reverse(s));
                             sc.close();
                         }
                         
}
