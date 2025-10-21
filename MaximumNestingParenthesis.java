import java.util.*;
class Solution 
{
  static int[] nestingOfParenthesis(String s)
  {
       int n=s.length();
        int[]res=new int[n];
        int dep=0;
        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)=='(')
           {
             dep++;
             res[i]=dep%2;
           }
           else if(s.charAt(i)==')')
           {
              res[i]=dep%2;
              dep--;
           }
        }
        
        return res;
    }
}
  
public class MaximumNestingParenthesis {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                         int[]res=Solution.nestingOfParenthesis(s);
                            for(int c:res)
                            {
                               System.out.print(c+" ");
                            }
                            sc.close();
                         }
                         
}
