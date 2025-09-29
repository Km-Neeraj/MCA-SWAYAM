import java.util.*;
class Solution 
{
   static ArrayList<Integer> merge(int[]arr,int n,int[]arr1)
   {
      ArrayList<Integer> res=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          res.add(arr[i]);
      }
      for(int i=0;i<n;i++)
      {
          res.add(arr1[i]);
      }
      Collections.sort(res);
      return res;
   }
}
public class MergeSortedArray {

                         public static void main(String[] args) {
                                                  int n;
                                                  Scanner sc=new Scanner(System.in);
                                                  n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                     arr[i]=sc.nextInt();
                                                  }
                                                  int[]arr1=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr1[i]=sc.nextInt();
                                                  }
                                                  
                                                  ArrayList<Integer> res=Solution.merge(arr,n,arr1);
                                                  System.out.println(res);
                                                  sc.close();

                                                  
                         }

                         
}
