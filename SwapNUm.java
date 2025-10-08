import java.util.*;
public class SwapNUm {
                         public static void main(String[] args) {
                                                  
                             int num1,num2;
                             System.out.println("Enter two numbers");
                             Scanner sc=new Scanner(System.in);
                             num1=sc.nextInt();
                             num2=sc.nextInt();
                             System.out.println("numbers before swapping");
                             System.out.println("num1 = "+num1+" and num2 = "+num2);
                             num1=num1+num2;
                             num2=num1-num2;
                             num1=num1-num2;
                             System.out.println("Numbers after Swapping");
                             System.out.println("num1 = "+num1+" num2 = "+num2);
                             sc.close();

                         }
}
