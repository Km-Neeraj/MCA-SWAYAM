import java.util.*;
class Solution 
{
   static int[] result(int[]arr1,int n,int[]arr2,int m)
   {
      int[]freq=new int[1001];
      for(int i=0;i<n;i++)
      {
         freq[arr1[i]]=1;
      }
      int[]temp=new int[m];
      int k=0;
      for(int i=0;i<arr2.length;i++)
      {
              if(freq[arr2[i]]==1)
                         {
                                                  temp[k++]=arr2[i];
                                                  freq[arr2[i]]=-1;
                         }           
      }
      int[]res=new int[k];
      for(int i=0;i<k;i++)
      {
         res[i]=temp[i];
      }
      return res;
   }
}
public class Intersection {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             System.out.println("Enter First Array Elements");
                             
                             int[]arr1=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr1[i]=sc.nextInt();
                             }
                             System.out.println("Enter Second Array length");
                             int m=sc.nextInt();
                             int[]arr2=new int[m];
                              for(int i=0;i<m;i++)
                              {
                                  arr2[i]=sc.nextInt();
                              }
                         int[]res=Solution.result(arr1,n,arr2,m);
                         System.out.println("Intersection of two Arrays = ");
for(int num:res)
{
                         System.out.println(num+" ");
}

                         }
                         
}
