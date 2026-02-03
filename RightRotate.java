import java.util.*;
class Solution 
{
   static void rightRotate(int[]arr,int n)
   {
       reverse(arr,0,n-1);
       reverse(arr,0,0);
       reverse(arr,1,n-1);  
   }
   static void reverse(int[]arr,int left,int right)
   {
        while(left<right )
        {
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
        }
   }
}
public class RightRotate {

                         public static void main(String[]abc)
                         {
                                                  Scanner sc=new Scanner(System.in);

                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];

                                                   for(int i=0;i<n;i++)
                                                   {
                                                      arr[i]=sc.nextInt();
                                                   }
                                                   Solution.rightRotate(arr, n);
                                         System.out.println("Array elements after one place right Rotation");
                                         for(int i=0;i<n;i++)
                                         {
                                              System.out.print(arr[i]+" ");
                                         }
                                         sc.close();
                         }
                         
}
