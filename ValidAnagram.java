import java.util.*;
class Solution 
{
     static boolean validAnagram(String s1,String s2)
     {
         if(s1.length()!=s2.length())
         return false;
         char[]ch=s1.toCharArray();
         char[]ch1=s2.toCharArray();
         Arrays.sort(ch);
         Arrays.sort(ch1);
         return Arrays.equals(ch,ch1);
     }
}
public class ValidAnagram {
                         public static void main(String[] args) {
                                                  
                            String s1,s2;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter two strings");
                            s1=sc.next();
                            s2=sc.next();
                            boolean res=Solution.validAnagram(s1,s2);
                            System.out.println("Result = "+res);
                            sc.close();


                         }
                         
}
