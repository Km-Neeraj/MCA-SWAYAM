class First{
      static int cbse(int x)
      {
       if(x<100)
       x=cbse(x+10);
       return(x-1);
      }
}
public class Cbse {
                         public static void main(String[] args) {

                            System.out.print(First.cbse(60));
                                                  
                         }
                         
}
