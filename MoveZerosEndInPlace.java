import java.util.*;
class Solution 
{
                         static void moveZero(int[]arr,int n)
                         {
                             int j=0;
                             for(int i=0;i<n;i++)
                             {
                               if(arr[i]!=0)
                               {
                                  int temp=arr[i];
                                  arr[i]=arr[j];
                                  arr[j]=temp;
                                  j++;
                               }
                             }
                         }
}
public class MoveZerosEndInPlace {
                         public static void main(String[] args) {
                                                  
                             Scanner sc = new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }

                             Solution.moveZero(arr, n);
                             System.out.println("Array elements after moving zeros to the end");
                             for(int num: arr)
                             {
                                System.out.print(num+" ");
                             }
                             sc.close();
                         }
                         
}
