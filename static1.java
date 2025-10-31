public class static1 {

                         static int count=0;
                         static1()
                         {
                             count++;
                             System.out.println("Object number "+count);
                         }
                         public static void main(String[]abc)
                         {
                            static1 ob=new static1();
                            static1 ob2=new static1();
                            static1 ob3=new static1();

                         }

                         
}

