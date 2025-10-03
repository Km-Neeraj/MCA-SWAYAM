import java.util.*;
class Solution 
{
    static String prefix(String[]arr,int n)
    {
      
         Arrays.sort(arr);
         String f=arr[0];
         String l=arr[n-1];
         int res=Math.min(f.length(),l.length());
         int i=0;
         while(i<res&&f.charAt(i)==l.charAt(i))
         i++;
         return f.substring(0,i);
    }
}
public class LongestCommonPrefix {
                         public static void main(String[] args) {
                           
                           int n;
                           Scanner sc=new Scanner(System.in);
                           n=sc.nextInt();
                           String[]arr=new String[n];
                           for(int i=0;i<n;i++)
                           {
                              arr[i]=sc.next();
                           }
                           System.out.println("Longest Common Prefix = "+Solution.prefix(arr,n));
                           sc.close();

                                                  
                         }
                         
}
