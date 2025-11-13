import java.util.*;
class Solution 
{
   static String mobileKeypad(String[]arr,String s)
   {
        s=s.toUpperCase();
        String res="";
        for(char ch:s.toCharArray())
        {
             if(ch==' ')
             {
                 res=res+"0";
             }
             else 
             {
                int pos=ch-'A';
                res=res+arr[pos];
             }
        }
        return res;
   }
}
public class MobileKeypad {
                         public static void main(String[] args) {
                                                  
                             String[]arr={
                                            "2","22","222",
                                            "3","33","333",
                                            "4","44","444",
                                            "5","55","555",
                                            "6","66","666",
                                            "7","77","777","7777",
                                            "8","88","888",
                                            "9","99","999","9999"};
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.nextLine();
                         String res=Solution.mobileKeypad(arr,s);
                         System.out.println("Output = "+res);
                         sc.close();
                             
                         }
                         
}
