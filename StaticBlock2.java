class Solution 
{
     static{
                 System.out.println("static block 1");

     }
     static 
     {
            System.out.println("static block 2");
     }
}
public class StaticBlock2 {
                         public static void main(String[] args) {
                                                  
                             Solution s=new Solution();
                         }
                         
}

