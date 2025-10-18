import java.util.*;
class Solution 
{
    static String maxOdd(String s)
    {
       for(int i=s.length()-1;i>=0;i--)
       {
           char ch=s.charAt(i);
           if(ch%2!=0)
           {
                String res=s.substring(0,i+1);
                return res;
           }
       }
       return "";
    }
}
public class MaxOdd {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            String res=Solution.maxOdd(s);
                            System.out.println("maxOdd = "+res);
                            sc.close();
                         }
                         
}
