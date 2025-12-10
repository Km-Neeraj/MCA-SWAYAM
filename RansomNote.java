import java.util.*;
class Solution 
{
   static boolean result(String s,String t)
   {
      int freq[]=new int[26];
      int freq1[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          freq[ch-'a']++;
      }
      for(char ch:t.toCharArray())
      {
           freq1[ch-'a']++;              
      }
      for(int i=0;i<26;i++)
      {
         if(freq[i]>freq1[i])
         {
                         return false;
         }
      }
      return true;
   }
}
public class RansomNote {

                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             String s=sc.next();
                             String t=sc.next();
                         boolean res=Solution.result(s,t);
                         if(res)
                         {
                                                  System.out.println("True can be constructed");

                         }
                         else 
                         {
                                                  System.out.println("can't be constructed");
                         }

                         }
                         
}
