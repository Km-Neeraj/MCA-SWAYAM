 abstract class Abc {
                        abstract void fun();
                         

                         
                         
}
class Child extends Abstract 
{
   public void fun()
   {
      System.out.println("Overriden by subclass");
   }
}
public class Abstract 
{
   public static void main(String[] args) {
      
        Child ob=new Child();
        ob.fun();

   }
}

