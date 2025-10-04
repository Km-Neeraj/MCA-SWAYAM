import java.util.*;
public class FindSum {
                         public static void main(String[]abc)
                         {
                            int n,m;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter value of n and m");
                            n=sc.nextInt();
                            m=sc.nextInt();
                            int sum=0;
                            for(int i=n;i<=m;i++)
                            {
                               if(i%3==0&&i%5==0)
                               {
                                   sum=sum+i;
                               }
                            }
                            System.out.println(sum);
                            sc.close();
                         }
                         
}
