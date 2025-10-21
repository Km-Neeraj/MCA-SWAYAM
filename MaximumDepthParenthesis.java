import java.util.*;
class Solution 
{
   static int maxNesting(String s)
   {
      int n=s.length();
      int max=0;
        int curr_max=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                curr_max++;
                if(curr_max>max)
                {
                   max=curr_max;
                }
            }
            else if(s.charAt(i)==')')
            {
               if(curr_max>0)
               {
                   curr_max--;
               }
               else 
               {
                   return -1;
               }
            }
        
        }
        if(curr_max!=0)
        {
          return -1;
        }
       return max; 
   }
}
public class MaximumDepthParenthesis {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int res=Solution.maxNesting(s);
                            System.out.println("Maximum Nesting Depth of the Parentheses = "+res);
                            sc.close();
                         }
                         
}
