class Human
{
    String name;
    int age;
    void show()
    {
         System.out.println(name+" "+age);
    }
    static 
    {
       System.out.println("Hii Human");
    }
}
    class Student extends Human{
       String schoolName;
       void print()
       {
          show();
          System.out.println(schoolName);
       }
       static 
       {
                System.out.println("Hii Student");
       }
    }

public class Inheritance1 {
                         public static void main(String[] args) {
                                                  
                             Student b=new Student();
                             b.name="Kapil";
                             b.age=24;
                             b.schoolName="GL Bajaj";
                             b.print();

                         }
                         
}
