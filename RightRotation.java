import java.util.*;
class Solution 
{
     static void rightRotate(int[]arr,int n,int d)
     {
        d=d%n;
        //reverse entire array
        rev(arr,0,n-1);
        //reverse first d elements
        rev(arr,0,d-1);
        //reverse d elements
        rev(arr,d,n-1);


     }
     static void rev(int[]arr, int start,int end)
     {
         while(start<end)
         {
              int tmp=arr[start];
              arr[start]=arr[end];
              arr[end]=tmp;  
              start++;
              end--;         
         }
}
}
public class RightRotation {
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
                         System.out.println("Enter Position to rotate array elements");
                         int pos=sc.nextInt();
                         Solution.rightRotate(arr,n,pos);
                         System.out.println("Array elements after right  rotation ");
                         for(int num:arr)
                         {
                             System.out.print(num+" ");
                         }
                         sc.close();
                         }
                         
}
