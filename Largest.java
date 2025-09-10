//find largest element in an array
import java.util.*;
class Solution 
{
    static int largestElement(int[]arr,int n)
    {
       Arrays.sort(arr);
       return arr[n-1];
    }
}
public class Largest {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the size of an array");
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             System.out.println("Enter an array elements");
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             int max=Solution.largestElement(arr,n);
                             System.out.println("Largest Element in an array = "+max);
                             sc.close();
                         }
                         
}
