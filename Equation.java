//Write a function to solve the following equation a3 + a2b + 2a2b + 2ab2 + ab2 + b3.
//Write a program to accept three values in order of a, b and c and get the
// result of the above equation.
import java.util.*;
public class Equation {
                         public static void main(String[]abc)
                         {
                             int a,b,c;
                             Scanner sc=new Scanner(System.in);
                             a=sc.nextInt();
                             b=sc.nextInt();
                             c=sc.nextInt();
                             int res=(a*a*a)+((a*a)*b)+(2*(a*a)*b)+(2*a*(b*b))+(a*(b*b))+(b*b*b);
                             System.out.print(res);
                             sc.close();
                         }
                         
}
