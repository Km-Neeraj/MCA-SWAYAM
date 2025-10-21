import java.util.*;
class Solution 
{
   static int countVowelSubstring(String s)
   {
                         int n=s.length();
       int count=0;
       for(int i=0;i<n;i++)
       {
           char ch=s.charAt(i);
           HashSet<Character> res=new HashSet<>();
           if(!isVowel(ch)) continue;
           for(int j=i;j<n;j++)
           {
                char ch1=s.charAt(j);
                if(!isVowel(ch1))
                {
                    break;
                }
                res.add(ch1);
                if(res.size()==5)
                count++;
           }
       }
       return count;
   }
   static boolean isVowel(char ch)
   {
     return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
   }
}
public class VowelSubString {
                         public static void main(String[] args) {
                                                  
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             int res=Solution.countVowelSubstring(s);
                             System.out.println("Number of substring having all vowel "+res);
                             sc.close();
                         }
                         
}
