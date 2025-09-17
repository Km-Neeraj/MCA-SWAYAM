import java.util.*;
class Solution
{
     static int largestElement(int[]arr,int n)
     {
                         int max=arr[0];
                         for(int i=0;i<n;i++)
                         {
                              if(arr[i]>max)
                              {
                                                  max=arr[i];
                              }
                         }
                         return max;
     }
}
public class LargestElement {
                         public static void main(String[]abc)
                         {
                             int n;
                             System.out.println("Enter Number of array elements");
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             int[] arr=new int[n];
                             System.out.println("Enter Array Elements");
                             for(int i=0;i<n;i++)
                             {
                                 arr[i]=sc.nextInt();
                             }
                             int largest=Solution.largestElement(arr,n);
                             System.out.println("Largest Element = "+largest);
                             sc.close();


                         }
                         
}
