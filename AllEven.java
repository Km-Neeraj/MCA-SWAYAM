import java.util.*;
public class AllEven {
                         public static void main(String[]abc)
                         {
                           Scanner sc=new Scanner(System.in);
                           int n=sc.nextInt();
                           System.out.println("All Even numbers from 1"+n );
                           for(int i=1;i<=n;i++)
                           {
                              if(i%2==0)
                              {
                                  System.out.print(i+" ");
                              }
                           }
                         }
                         
}
