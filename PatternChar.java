import java.util.*;
public class PatternChar {
                         public static void main(String[]abc)
                         {
                           Scanner sc=new Scanner(System.in);
                           char ch='I';
                           char ch1='I';
                           int n=sc.nextInt();
                           for(int i=0;i<n;i++)
                           {
                              for(int j=1;j<=i;j++)
                              {
                                System.out.print(" ");
                              }
                              for(int k=1;k<=2*(n-i)-1;k++)
                              {
                                System.out.print(ch--);
                              }
                              for(int j=1;j<=i;j++)
                              {
                                  System.out.print(" ");              
                              }
                              ch1--;
                              ch=ch1;
                              System.out.println();
                           }
                           for(int i=n-2;i>=0;i--)
                           {
                              for(int j=1;j<=i;j++)
                              {
                                System.out.print(" ");
                              }
                              for(int k=1;k<=2*(n-i)-1;k++)
                              {
                                System.out.print(ch++);
                              }
                              for(int j=1;j<=i;j++)
                              {
                                  System.out.print(" ");              
                              }
                              ch1--;
                              ch=ch1;
                              System.out.println();
                           }
                           sc.close();
                         }
                         
}
