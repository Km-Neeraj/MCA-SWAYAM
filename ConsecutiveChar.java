import java.util.*;
class Solution 
{
     static int res(String s)
     {
          int count=1;
          int maxLen=1;
          for(int i=1;i<s.length();i++)
          {
              if(s.charAt(i)==s.charAt(i-1))
              {
                  count++;
              }
              else 
              {
                 count=1;
              }
              maxLen=Math.max(maxLen,count);
          }
          return maxLen;
     }
}
public class ConsecutiveChar {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             int res=Solution.res(s);
                             System.out.println("Max Consecutive Cahr Length = "+res);
                             sc.close();

                         }
                         
}
