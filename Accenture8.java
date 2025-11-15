import java.util.*;
class Solution 
{
    static String result(String s)
    {
                         if(s.length()==0)
                         return null;
       String res="";
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)=='-')
           {
                 res=s.charAt(i)+res;
           }
           else 
           {
               res=res+s.charAt(i);
           }
       }
       return res;
    }
}
  public class Accenture8 {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            String s;
                             s=sc.next();
                           String res=Solution.result(s);
                           System.out.println(res);
                           sc.close();
                         }
                         
}
