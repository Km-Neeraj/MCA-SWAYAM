import java.util.*;
class Solution 
{
   static void count(String s)
   {
      s=s.toLowerCase();
      int c=0,v=0,d=0,sp=0;
      char ch1[]=s.toCharArray();
      for(int i=0;i<ch1.length;i++)
      {
         char ch=ch1[i];
         if((ch>='a'&&ch<='z'))
         {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                          v++;
            }
            else 
            {
                    c++;
            }
          }
          else if(ch>='0'&&ch<='9')
          {
             d++;
          }
          else 
          {
             sp++;
          }

      }
      System.out.println("Vowels = "+v);
      System.out.println("Consonants = "+c);
      System.out.println("Digits = "+d);
      System.out.println("Special Characters = "+sp);

   } 
}
public class CountCharacterType {
                         public static void main(String[] args) {
                              String s;
                              Scanner sc=new Scanner(System.in);
                              s=sc.next();
                              Solution.count(s);
                              sc.close();
                         }
                         
}
