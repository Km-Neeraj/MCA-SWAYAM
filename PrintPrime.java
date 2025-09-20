import java.util.*;
public class PrintPrime {
                         public static void main(String[]abc)
                         {
                            int terms;
                            System.out.println("Enter the terms of printing prime numbers");
                            Scanner sc=new Scanner(System.in);
                            terms=sc.nextInt();
                            for(int i=2;i<=terms;i++)
                            {
                                 int count=0;
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
                         }
                         
}
