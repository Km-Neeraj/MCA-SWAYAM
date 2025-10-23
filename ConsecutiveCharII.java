import java.util.*;
class Solution 
{
                             static String result(String s)
                             {
                                 StringBuilder res=new StringBuilder();
                                  for(int i=0;i<s.length()-1;i++)
                                  {
                                      if(s.charAt(i)!=s.charAt(i+1))
                                      {
                                         res.append(s.charAt(i));
                                      }

                                  }
                                  res.append(s.charAt(s.length()-1));
                                  return res.toString();
                             }
}
public class ConsecutiveCharII {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             String res=Solution.result(s);
                             System.out.println("Result = "+res);
                             sc.close();
                         }
                         
}
