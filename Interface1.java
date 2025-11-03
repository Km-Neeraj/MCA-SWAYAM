interface Abc 
{
     void fun();
}
interface Abc1{
                         void fun1();
}
class Result implements Abc,Abc1
{
                         public void fun()
                         {
                             System.out.println("Hii Fun");
                         }
                         public void fun1()
                         {
                             System.out.println("Hello Fun1");
                         }
}
public class Interface1 {
                         public static void main(String[] args) {
                                                  
                             Result ob=new Result();
                             ob.fun();
                             ob.fun1();
                         }
                         
}
