import java.util.*;
class Solution 
{
    static int count(String[]s,String allowed)
    {
        
        int c=0;
        HashSet<Character> res=new HashSet<>();
        for(char ch: allowed.toCharArray())
        {
            res.add(ch);
        }
           for(String w:s)
        {
            boolean flag=true;

            for(char ch:w.toCharArray())
            {
                    if(!res.contains(ch))
                    {
                        flag=false;
                        break;
                    }
            }
            if(flag)
            {
                  c++;
            }
        }
        return c;
    }
}
public class ConsistentString {
                         public static void main(String[] args) {
                                                  
                              String allowed;
                              int n;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter size of a String");
                              n=sc.nextInt();
                              String[]s=new String[n];
                              System.out.println("Enter String");
                              for(int i=0;i<n;i++)
                              {
                                 s[i]=sc.next();
                              }
                              System.out.println("Enter Allowed ");
                              allowed=sc.next();
                              int res=Solution.count(s,allowed);
                              System.out.println("Output = "+res);
                              sc.close();
                         }
                         
}
