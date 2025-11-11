class Solution 
{
                         static void fibonacci()
                         {
                             int f1=1,f2=1,f3=0;
                             while(true)
          {
              int count=0;
              f3=f1+f2;
              f1=f2;
              f2=f3;
              int temp=f3;
              while(temp!=0)
              {
                  count++;
                  temp/=10;
              }  
              if(count==7)
              {
                         System.out.println(f3);
                         return;
              }
          }
                         }
}
public class Fibonacci7thDigit {
 
      public static void main(String[] args) {
   
   Solution.fibonacci();
   

            
         
      }
                         
}
