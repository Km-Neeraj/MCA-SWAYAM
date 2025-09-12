//Find Second Largest Element Without Sorting
import java.util.*;
class Solution 
{
     static int secondLargest(int[]arr,int n)
     {
       int largest=-1,s_largest=-1;
       for(int i=0;i<n;i++)
       {
             if(arr[i]>largest)
             {
                 s_largest=largest;
                 largest=arr[i];
             }
             else if(arr[i]<largest&&arr[i]>s_largest)
             {
                         s_largest=arr[i];
             }
       }
       return s_largest;

     }
}
public class SecondLargest {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter the array elements");
                            for(int i=0;i<n;i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            int s_Largest=Solution.secondLargest(arr,n);
                            System.out.println("Second largest element = "+s_Largest);
                            sc.close();
                         }
                         
}
