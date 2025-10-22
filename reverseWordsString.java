import java.util.*;
class Solution 
{
   static String reverseWords(String s)
   {
       String[]s1=s.split(" ");
       StringBuilder res=new StringBuilder();
       for(String ch: s1)
       {
             StringBuilder ch1=new StringBuilder(ch);
             ch1.reverse();
             ch1.toString();
             res.append(ch1).append(" ");
       }
       return res.toString().trim();
   }
}
public class reverseWordsString {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String");
                            s=sc.nextLine();
                            String res=Solution.reverseWords(s);
                            System.out.println("Reverse String words = "+res);
                            sc.close();

                         }
                         
}
