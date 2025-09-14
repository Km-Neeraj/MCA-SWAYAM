import java.util.*;
class Solution 
{
      static int[] sort012(int[]arr,int n)
      {
          int lo=0;
          int hi=n-1;
          int mid=0;
          while(mid<=hi)
          {
              if(arr[mid]==0)
              {
                 int temp=arr[lo];
                 arr[lo++]=arr[mid];
                 arr[mid]=temp;
              }
              else if(arr[mid]==1)
              {
                  mid++;
              }
              else if(arr[mid]==2)
              {
                         int temp=arr[mid];
                         arr[mid]=arr[hi];
                         arr[hi--]=temp;
              }
          }
          return arr;
      }
}
public class Sort012 {
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
                            System.out.println("array elements after sorting 0 1 and 2");
                            int[]res=Solution.sort012(arr,n);
                            for(int i=0;i<n;i++)
                            {
                                System.out.print(res[i]+" ");
                            }
                            sc.close();

                         }
                         
}
