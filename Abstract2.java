abstract class Abc 
{
    abstract void fun();

}
abstract class Abc1 
{
    abstract void fun1();
    void fun()
    {
         System.out.println("Hii fun class ");
    }

} 
class Child extends Abc1{
    
                         void fun1()
                         {
                             System.out.println("Child class Override fun1");
                         }
}
public class Abstract2 {
                         public static void main(String[] args) {
                                                  
                             Child ob=new Child();
                             ob.fun1();
                             ob.fun();
                         }
                         
}
