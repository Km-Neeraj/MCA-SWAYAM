import java.util.*;
public class isPalindrome {
                         public static void main(String[]abc)
                         {
                            int n;
                            int rev=0;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int temp=n;
                            while(n>0)
                            {
                              int rem=n%10;
                               rev=rev*10+rem;
                              n=n/10;
                            }
                            if(temp==rev)
                            {
                                                  System.out.println(temp+" is palindrome");
                            }
                            else 
                            {
                               System.out.println(temp+" is not a palindrome");
                            }
                            sc.close();

                         }
                         
}
