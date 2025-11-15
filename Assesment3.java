import java.util.*;
class Solution 
{
   static void patternMatching(String s,String Patt)
   {
       char[]words=s.toCharArray();
       int n=words.length;
       
       for(int i=0;i<n;i++)
       {
                         StringBuilder res=new StringBuilder();
          for(int j=i;j<n;j++)
          {
             res.append(words[j]);
             if(res.toString().equals(Patt))
             {
                 System.out.println((i+1)+" "+(j+1));  
             }
          }
       }
   }
}
public class Assesment3 {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            String pat;
                            System.out.println("Enter String ");
                            s=sc.next();
                            System.out.println("Enter Pattern");
                            pat=sc.next();
               Solution.patternMatching(s,pat);
               sc.close();
         
                         }
                         
}


/* 
Enter String 
Pen,pencil,Penguin
Enter Pattern
Pen
1 3
12 14 */
