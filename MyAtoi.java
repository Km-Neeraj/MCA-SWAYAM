import java.util.*;
class Solution 
{
    static int myAtoi(String s)
    {
        int res=0,sign=1,idx=0;
        int length=s.length();
        while(idx<length&&s.charAt(idx)==' ')
        idx++;
        while(idx<length&&(s.charAt(idx)=='-'||s.charAt(idx)=='+'))
        {
              if(s.charAt(idx++)=='-')
              sign=-1;
        }
        while(idx<length&&(s.charAt(idx)>='0'&&s.charAt(idx)<='9'))
        {
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&s.charAt(idx)-'0'>7))
             return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=10*res+(s.charAt(idx++)-'0');
        }
        return res*sign;
    }
}
public class MyAtoi {
                         public static void main(String[] args) {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                          int num=Solution.myAtoi(s);
                          System.out.println("MyAtoi = "+num);
                          sc.close();
                         }
                         
}
