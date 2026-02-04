//import java.util.LinkedHashSet;
import java.util.*;
class Solution 
{
   static LinkedHashSet<Integer> union(int[]arr1,int n,int arr2[],int m)
   {
       LinkedHashSet<Integer> res=new LinkedHashSet<>();
       for(int num:arr1)
            res.add(num);
        for(int num: arr2)
              res.add(num);
       return res;
   }
}
public class Union1 {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter First Array size");
                            int n=sc.nextInt();
                            System.out.println("Enter Second Array Size");
                            int m=sc.nextInt();
                            int[]arr1=new int[n];
                            int []arr2=new int[m];

                            System.out.println("Enter first Array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr1[i]=sc.nextInt();
                            }

                            System.out.println("Enter Second Array elements");

                            for(int i=0;i<m;i++)
                            {
                              arr2[i]=sc.nextInt();
                            }
                          LinkedHashSet<Integer> res=Solution.union(arr1,n,arr2, m);
                          for(int num:res)
                          {
                                                  System.out.print(num+" ");
                          }
                          sc.close();
                         }
                         
}
