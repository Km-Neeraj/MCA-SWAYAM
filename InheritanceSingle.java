class A 
{
                         void fun()
                         {
                                                  System.out.println("Have fun fron Parent class A");
                         }
}
class B extends A 
{
                         void fun()
                         {
                             System.out.println("Have fun fron child class B");
                         }
}
public class InheritanceSingle {
public static void main(String[] args) {
                         B ob=new B();
                         ob.fun();
}
                         
}
