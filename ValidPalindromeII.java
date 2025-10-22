import java.util.*;
class Solution 
{
    static boolean validPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<j)
        {
           if(s.charAt(i)==s.charAt(j))
           {
              i++;
              j--;
           }
           else 
           {
                return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);

           }

        }
        return true;
    }
    static boolean isPalindrome(String s,int low,int high)
    {
        while(low<high)
        {
           if(s.charAt(low)!=s.charAt(high))
           return false;
         low++;
         high--;
        }
        return true;
    }
}
public class ValidPalindromeII {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             boolean res=Solution.validPalindrome(s);
                             System.out.println("Valid palindromde = "+res);
                             sc.close();
                         }
                         
}
