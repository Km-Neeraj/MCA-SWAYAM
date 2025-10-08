import java.util.*;
public class AllPalindromeRange {
                         public static void main(String[] args) {
                                                  
                             int range;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter range to print Palindrome Number");
                             range=sc.nextInt();
                             System.out.println("All Palindrome Numbers List");
                             for(int i=1;i<=range;i++)
                             {
                                 int temp=i,rev=0;
                                 int copy=i;
                                 while(temp!=0)
                                 {
                                    int rem=temp%10;
                                    rev=rev*10+rem;
                                    temp/=10;

                                    
                                 }
                                 if(copy==rev)
                                 System.out.print(i+" ");
                             }
                             sc.close();
                             
                         }
                         
}
