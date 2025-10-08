//Rptate Array by k position 
import java.util.*;
class Solution 
{
        static int[] rotate(int[]arr,int n,int k)
        {
              k=k%n;
               //Rotate last n-k elements
              for(int i=n-k,j=n-1;i<j;i++,j--)
              {
                         int temp=arr[i];
                         arr[i]=arr[j];
                         arr[j]=temp;
              }
              //Rotate First n-k elements
              for(int i=0,j=n-k-1;i<j;i++,j--)
              {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
              for(int i=0,j=n-1;i<j;i++,j--)
              {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
              }
              return arr;
}


}
public class Rotate {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter THe number of an Array elements");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter the position of an array rotation");
                            int k=sc.nextInt();
                            int[]res=Solution.rotate(arr,n,k);
                            System.out.println("Array elements after Rotating k places");
                            for(int i=0;i<n;i++)
                            {
                               System.out.print(res[i]+" ");
                            }
                            sc.nextInt();
                         }
                         
}
