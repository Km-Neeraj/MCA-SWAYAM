import java.util.*;
class Solution 
{
   static int romanToInteger(String s)
   {
      HashMap<Character, Integer> res=new HashMap<>();
      res.put('I',1);
      res.put('V',5);
      res.put('X',10);
      res.put('L', 50);
      res.put('C', 100);
     res.put('D', 500);
     res.put('M', 1000);

     int ans=0;
     int n=s.length();
     for(int i=0;i<n;i++)
     {
       if(i+1<n&&res.get(s.charAt(i))<res.get(s.charAt(i+1)))
       {
          ans=ans+res.get(s.charAt(i+1))-res.get(s.charAt(i));
          i++;
       }
       else 
       {
              ans=ans+res.get(s.charAt(i));
       }
     }
     return ans;
   }
}
public class RomanToInteger {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int num=Solution.romanToInteger(s);
                            System.out.println("Roman To Integer = "+num);
                            sc.close();

                         }
                         
}
