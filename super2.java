class Parent 
{
   void fun()
   {
     System.out.println("Parent fun");
   }
}
class Child extends Parent
{
    void fun()
    {
        System.out.println("Child Fun");
    
    super.fun();
    }
}
public class super2 {
                         public static void main(String[] args) {
                                                  
                              Child ob=new Child();
                              ob.fun();
                         }
                       

}
