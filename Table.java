import java.util.*;
public class Table {
                         public static void main(String[]abc)
                         {
                            int num;
                            Scanner sc=new Scanner(System.in);
                            num=sc.nextInt();
                            int sum=0;
                            for(int i=1;i<=10;i++)
                            {
                                int temp=num*i;
                                System.out.print(temp+" ");
                                sum=sum+temp;
                            }
                            System.out.println();
                            System.out.print(sum);
                            sc.close();
                         }
                         
}
