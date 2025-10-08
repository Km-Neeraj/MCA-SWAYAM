import java.util.*;
public class AllPrimeNumList {
                         public static void main(String[] args) {
                         
                            int range;
                            System.out.println("Enter range to print all prime numbers");
                            Scanner sc=new Scanner(System.in);
                            range=sc.nextInt();
                            int count;
                            System.out.println("All prime numbers List till range");
                            for(int i=1;i<=range;i++)
                            {
                               count=0;
                               for(int j=1;j<=i;j++)
                               {
                                   if(i%j==0)
                                   {
                                                  count++;
                                   }
                               }
                               if(count==2)
                               {
                                 System.out.print(i+" ");
                               }
                            }
                            sc.close();
                         }
                         
}
