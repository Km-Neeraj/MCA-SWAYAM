import java.util.*;
class Solution 
{
      static  ArrayList<Integer> negPos(int[]arr,int n)
      {
           ArrayList<Integer> neg=new ArrayList<>();
           ArrayList<Integer> pos=new ArrayList<>();
           for(int i:arr)
           {
                   if(i>=0)
                   {
                       pos.add(i);
                   }
                   else 
                   {
                         neg.add(i);
                   }
           }
           ArrayList<Integer> res=new ArrayList<>();
           for(int c:neg)
           {
                res.add(c);
           }
           for(int c:pos)
           {
               res.add(c);
           }
           return res;
      }
}
public class NegPos {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            ArrayList<Integer> res=Solution.negPos(arr,n);
                               System.out.print(res);
                         
                               sc.close();
                         }
                         
}
