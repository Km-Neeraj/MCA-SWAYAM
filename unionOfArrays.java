import java.util.*;
class Solution 
{
   static TreeSet<Integer> union(int[]arr1,int n,int[]arr2,int m)
   {
      TreeSet<Integer> res=new TreeSet<>();
      ArrayList<Integer> res1=new ArrayList<>();
      int[]arr=new int[n+m];
      for(int i=0;i<n;i++)
      {
        res1.add(arr1[i]);
      }
      for(int i=0;i<m;i++)
      {
        res1.add(arr2[i]);
      }
      for(int c:res1)
      {
         res.add(c);
      }
      return res;
      
   }
}
public class unionOfArrays {
                         public static void main(String[]abc)
                         {
                            int n,m;
                            System.out.println("Enter the size of two arrys");
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            m=sc.nextInt();
                            int[]arr1=new int[n];
                            System.out.println("Enter first array elements");
                            for(int i=0;i<n;i++)
                            {
                                 arr1[i]=sc.nextInt();
                            }
                            System.out.println("Enter second array elements");
                            int[]arr2=new int[m];
                            for(int i=0;i<m;i++)
                            {
                                arr2[i]=sc.nextInt();
                            }
                            System.out.println("Arrays Element after union of arrays");
                            TreeSet<Integer> res=Solution.union(arr1,n,arr2,m);
                            for(int i:res)
                            {
                               System.out.print(i+" ");
                            }
                            sc.close();
                         }
                         
}
