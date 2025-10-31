class Parent 
{
     int x=10;

}
class Child extends Parent 
{
    void swap()
    {
    
                         int y=20;
    int c=super.x;
    System.out.println("variable before swapping  x = "+super.x+ " y = "+y);
     super.x=y;
     y=c;
     System.out.println("variable after swapping x = "+super.x+" y = "+y);

    }

}
public class super1 {
                         public static void main(String[] args) {
                                                  Child ob=new Child();
                                                  ob.swap();

                                                  
                              
                         }
                         
}
