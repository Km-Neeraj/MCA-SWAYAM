//You have write a function that accepts, a string which length is 
//“len”, the string has some “#”, in it you have to move all the hashes to 
//the front of the string and return the whole string back and print it.
import java.util.*;
class Solution 
{
     static String moveHashFront(String s)
     {
                         String s1="";
                         String s2="";
                         for(char c:s.toCharArray())
                         {
                           if(c=='#')
                           {
                             s1=s1+c;
                           }
                           else 
                           {
                             s2=s2+c;
                           }
                         }
                         return s1.concat(s2);
     }
}
public class MoveHash {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                             
                             String res=Solution.moveHashFront(s);
                             System.out.println("Original String = "+s);
                             System.out.println("String after moving Hash to Front "+res);
                             sc.close();

                         }
                         
}
