import java.util.*;
class Solution 
{
   static void printDuplicateChar(String s)
   {
      
      char[]ch=s.toCharArray();
      Arrays.sort(ch);

      for(int i=0;i<ch.length;)
      {
          int count=1;
          while(i+count<ch.length&&ch[i]==ch[i+count])
          {
               count++;
          }
          if(count>1)
          {
               System.out.print("['"+ch[i]+"',"+count+"],");
          }
          i=i+count;
      }
   }
}
public class DuplicateChar {
                         public static void main(String[] args) {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.next();
                             Solution.printDuplicateChar(s);
                             sc.close();
                         }
                         
}
