import java.util.*;
class Solution 
{
   static int longest(String s)
   {
      int n;
      n=s.length();
      if(n<5)
      return 0;
      int currLen=1;
      int uniChar=1;
      int max=0;
      for(int i=1;i<n;i++)
      {
          char ch=s.charAt(i);
          char prev=s.charAt(i-1);
          if(ch>=prev)
          {
              currLen++;
              if(ch>prev)
              uniChar++;
          }
          else 
          {
               currLen=1;
               uniChar=1;
          }
          if(uniChar==5)
          {
              max=Math.max(max,currLen);
          }
      }
          
          return max;
      }
   }

public class LongestVowelSubstring {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int n=Solution.longest(s);
                            System.out.println("Longest Substring of all vowels in order "+n);
                            sc.close();
                         }
                         
}
