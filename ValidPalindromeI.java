import java.util.*;
class Solution 
{
      static boolean validPalindrome1(String s)
      {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                           i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                 j--;
            }
            else if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j)))
            {
                  i++;
                  j--;
            }
            else 
            {
               return false;
            }
        }
        return true;
      }
}
public class ValidPalindromeI {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.nextLine();
                            boolean res=Solution.validPalindrome1(s);
                            System.out.println("Result = "+res);
                            sc.close();
                         }
                         
}
