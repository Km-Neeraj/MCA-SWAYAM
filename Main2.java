class Person{
      String name;
      int age;
      void show()
      {
            System.out.println(name+" "+age);
      }
      Person()
      {
                System.out.println("Hello Person");
                name="Ram";
                age=10;
      }
      {
                         System.out.println("OK");
                         name="Jai";

      }
      {
            System.out.println("Welcome");
      }
      static{
                    System.out.println("Heyyyy!");
      }
}
public class Main2 {
                         public static void main(String[] args) {
                                                  
                                                  Person p1=new Person();
                                                  p1.show();
                         }
                         
}
