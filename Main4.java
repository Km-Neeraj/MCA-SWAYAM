class Toy{
           int price;
           String name;
           Toy()
           {
                    this(230);
                    name="xyz";
           }
           static{
                 System.out.println("Static block");
           }
           {
                         price=340;
           }
           Toy(int p)
           {
            price =p;
           }
}
public class Main4 {
                         public static void main(String[] args) {
                                                  
                         Toy t1=new Toy();
                         System.out.println(t1.name+" "+t1.price);
                         }
                         
}
