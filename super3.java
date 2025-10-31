class Parent 
{
   Parent(int x)
   {
      System.out.println("Parent x value = "+x);
   }
}
class Child extends Parent 
{
    Child()
    {
          super(10);
          System.out.println("Child class Constructor");
    }
}
public class super3 {
                         public static void main(String[]abc)
                         {
                              Child ob=new Child();
                              
                         }
                         
}
