import java.util.*;
class Solution 
{
    static String longestPalindrome(String s)
    {
       int n=s.length();
       int start=0,maxLen=1;
       for(int i=0;i<n;i++)
       {
            for(int j=i;j<n;j++)
            {
                  if(isPalindrome(s,i,j) && (j-i+1)>maxLen)
                  {
                     start=i;
                     maxLen=j-i+1;
                  }
            }
       }
       return s.substring(start,maxLen+start);
    }
    static boolean isPalindrome(String s,int low,int high)
    {
      while(low<high)
      {
          if(s.charAt(low)!=s.charAt(high))
          {
                         return false;
          }
          low++;
          high--;
      }
      return true;
    }
}
public class LongestPalindromicSubString {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             String res=Solution.longestPalindrome(s);
                             System.out.println("Longest Palindromic Substring = "+res);
                             sc.close();
                         }
                         
}
