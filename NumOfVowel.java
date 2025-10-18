import java.util.*;
class Solution 
{
     static int count(String[] s, int left, int right)
     {
         int c=0;
         for(int i=left;i<=right;i++)
         {
            String w=s[i].toLowerCase();
            char f=w.charAt(0);
            char l=w.charAt(w.length()-1);
            if(isVowel(f)&&isVowel(l))
            {
                c++;
            }
         }
            return c;
         }
         private static boolean isVowel(char ch) 
         {
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             {
                return true;
             }
             return false;
         }
     }

public class NumOfVowel {
                         public static void main(String[] args) {
                                                  
                            int n;
                            int right;
                             int left;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter size of string");
                            n=sc.nextInt();
                            String s[]=new String[n];
                            System.out.println("Enter String");
                            for(int i=0;i<n;i++)
                            {
                               s[i]=sc.next();
                            }
                            System.out.println("Enter left and right value");
                            left=sc.nextInt();
                            right=sc.nextInt();
                            int res=Solution.count(s,left,right);
                            System.out.println("output = "+res);
                            sc.close();
                         }
                         
}
