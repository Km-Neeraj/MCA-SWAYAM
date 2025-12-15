import java.util.*;
class Solution 
{
    static boolean result(String s,String t)
    {
      if(s.length()!=t.length())
      {
         return false;
      }
      int freq[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        freq[s.charAt(i)-'a']++;
        freq[t.charAt(i)-'a']--;

      }
      for(int c:freq)
      {
        if(c!=0)
                         return false;
      }
      return true;
    }
}
public class CheckAnagram {

                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             String s=sc.next();
                             String t=sc.next();
                             boolean res=Solution.result(s,t);
                             if(res)
                                                  System.out.println("Yes anagram");
                              else 
                                                  System.out.println("No not Anagram each other");
                         sc.close();
                         }
                         
}
