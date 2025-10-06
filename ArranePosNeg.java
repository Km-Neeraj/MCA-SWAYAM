import java.util.*;
class Solution{
   static void rearrange(ArrayList<Integer> arr)
   {
      //create ArrayList for storing positive and negative elements
      ArrayList<Integer> pos=new ArrayList<>();   //for Positive elements
      ArrayList<Integer> neg=new ArrayList<>();   //for negative elements

      //store separately positive and negative elements
      for(int i=0;i<arr.size();i++)
      {
          if(arr.get(i)>=0)
          pos.add(arr.get(i));
          else 
          neg.add(arr.get(i));
      }
      //now arrange positive and negative numbers alternatively
      int posIdx=0,negIdx=0;
      int i=0;
      while(posIdx<pos.size()&&negIdx<neg.size())
      {
         if(i%2==0)
         arr.set(i++,pos.get(posIdx++));
         else 
         arr.set(i++,neg.get(negIdx++));
      }
      while(posIdx<pos.size())
      arr.set(i++,pos.get(posIdx++));
      while(negIdx<neg.size())
      arr.set(i++,neg.get(negIdx++));

   }
}
public class ArranePosNeg {
                         public static void main(String[]abc)
                         {
                             ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,-1,2,3,10,-23,-5,7));
                             Solution.rearrange(arr);
                             System.out.println("Elements after arranging alternating positive and negative");
                             for(int i=0;i<arr.size();i++)
                             {
                                System.out.print(arr.get(i)+" ");
                             }
                             
                         }
                         
}
