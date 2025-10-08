import java.util.*;
class Solution 
{
   static ArrayList<Integer> union(int[]arr,int n,int[]arr1,int m)
   {
      LinkedHashSet<Integer> res=new LinkedHashSet<>();
      for(int i=0;i<n;i++)
      {
         res.add(arr[i]);
      }
      for(int i=0;i<m;i++)
      {
        res.add(arr1[i]);
      }
      return new ArrayList<>(res);
   }
}
public class uni {
                         public static void main(String[] args) {
                            int n,m;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of first and second array");
                            n=sc.nextInt();
                            m=sc.nextInt();
                            System.out.println("Enter First Array");
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             int[]arr1=new int[m];
                             System.out.println("Enter second array");
                             for(int i=0;i<m;i++)
                             {
                               arr1[i]=sc.nextInt();
                             }
                             ArrayList<Integer> res=Solution.union(arr,n,arr1,m);
                             System.out.println("Union of two array elements are");
                             for(int num:res)
                             {
                                System.out.print(num+" ");
                             }
                             sc.close();
                                                  
                            }
                                                  
                         }
                         

