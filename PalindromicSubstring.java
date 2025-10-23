import java.util.*;
class Solution 
{
  static int palindromicSubstring(String s)
  {
       int res=0;
       int n=s.length();
       for(int i=0;i<n;i++)
       {
          for(int j=i;j<n;j++)
          {
              if(isPalindrome(s,i,j))
              res++;
          }
       }
       return res;
  }
  static boolean isPalindrome(String s,int i,int j)
  {
     while(i<j)
     {
        if(s.charAt(i)!=s.charAt(j))
        {
            return false;
        }
        i++;
        j--;
     }
     return true;
  }
}
public class PalindromicSubstring {
                         public static void main(String[] args) {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int res=Solution.palindromicSubstring(s);
                            System.out.println("Result = "+res);
                            sc.close();
                         }
                         
}
