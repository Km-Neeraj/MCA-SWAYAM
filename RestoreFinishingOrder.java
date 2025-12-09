import java.util.*;
class Solution 
{
    static int[] result(int[]order,int n,int[]friends,int m)
    {
       int[]res=new int[m];
       int k=0;
       for(int i=0;i<n;i++)
       {
          for(int j=0;j<m;j++)
          {
             if(order[i]==friends[j])
             {
                 res[k++]=order[i];
             }
          }

       }
       return res;
    }
}
public class RestoreFinishingOrder {
   public static void main(String[]abc)
   {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      int[]order=new int[n];
      
      for(int i=0;i<n;i++)
      {
         order[i]=sc.nextInt();
      }
      System.out.println("Enter friends length");
      int m=sc.nextInt();
      int friends[]=new int[m];
      for(int j=0;j<m;j++)
      {
         friends[j]=sc.nextInt();

      }
      int res[]=Solution.result(order,n,friends,m);
      for(int i=0;i<res.length;i++)
      {
          System.out.print(res[i]+" ");
      }
      sc.close();
   }
                         
}
