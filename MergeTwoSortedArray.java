import java.util.*;
class Solution 
{
                         static int[] mergedArray(int[]arr1,int n,int[]arr2,int m)
                         {
                             int[]merge=new int[n+m];
                             int i=0,j=0,k=0;
                             while(i<n&&j<m)  
                             {
                               if(arr1[i]<=arr2[j])
                               {
                                  merge[k++]=arr1[i++];
                               }
                               else 
                               {
                                    merge[k++]=arr2[j++];
                               }
                             }
                                                                                 
                                while(i<n)
                                {
                                                  merge[k++]=arr1[i++];
                                }
                                while(j<m)
                                {
                                                  merge[k++]=arr2[j++];
                                }

                                return merge;

                         }
                         



}
public class MergeTwoSortedArray {
                         public static void main(String[]abc)
                         {
                                                  Scanner sc=new Scanner(System.in );
                                                  System.out.println("Enter size of first array");
                                                  int n=sc.nextInt();
                                                  System.out.println("Enter Second array size");
                                                  int m=sc.nextInt();
                                                  System.out.println("Enter Array1 Elements");
                                                  int[]arr1=new int[n];
                                                  int[]arr2=new int[m];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr1[i]=sc.nextInt();
                                                      
                                                  }
                                                  System.out.println("enter Second Array elements");
                                                  for(int i=0;i<m;i++)
                                                  {
                                                     arr2[i]=sc.nextInt();
                                                  }
                                       int[]merge=Solution.mergedArray(arr1,n,arr2,m);
                                       System.out.println("Array elements after merging each other");
                                       for(int i=0;i<merge.length;i++)
                                       {
                                            System.out.print(merge[i]+" ");
                                       }
                                       sc.close();

                         }
                         
}
