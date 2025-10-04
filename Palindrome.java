import java.util.*;
public class Palindrome {
                         public static void main(String[]abc)
                         {
                             int lowerLimit,upperLimit;
                             Scanner sc=new Scanner(System.in);
                             lowerLimit=sc.nextInt();
                             upperLimit=sc.nextInt();
                             for(int i=lowerLimit;i<=upperLimit;i++)
                             {
                                int temp=i;
                                int rev=0,rem;
                                int num=i;
                                while(num!=0)
                                {
                                    rem=num%10;
                                    rev=rev*10+rem;
                                    num=num/10;
                                }
                                if(rev==temp)
                                {
                                   System.out.print(i+" ");
                                }
                             }
                             sc.close();

                         }
                         
}
