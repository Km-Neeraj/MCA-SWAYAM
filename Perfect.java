import java.util.*;
public class Perfect {
                         public static void main(String[]abc)
                         {
                             int num;
                             Scanner sc=new Scanner(System.in);
                             num=sc.nextInt();
                             
                             int sum=0;
                             for(int i=1;i<num;i++)
                             {
                                 if(num%i==0)
                                 {
                                      sum=sum+i;
                                 }
                             }
                             if(sum==num)
                             {
                                System.out.print(num+" is a perfect number");
                             }
                             else 
                             {
                                 System.out.println(num+" is not a perfect number");
                             }
                             sc.close();
                         }
                         
}
