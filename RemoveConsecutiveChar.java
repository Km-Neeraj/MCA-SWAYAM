import java.util.*;
class Solution 
{
     static String removeConsecutiveChar(String s)
     {
           int n=s.length();
           if(n==0)
           return s;
           StringBuilder res=new StringBuilder();
           for(int i=0;i<n;i++)
           {
               int m=res.length();
               if(m==0||res.charAt(m-1)!=s.charAt(i))
               {
                  res.append(s.charAt(i));
               }
           }
           return res.toString();
     }
}
public class RemoveConsecutiveChar {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            String s1=Solution.removeConsecutiveChar(s);
                            System.out.println("String After Deleting duplicate Consecutive character "+s1);
                            sc.close();
                         }
                         
}
