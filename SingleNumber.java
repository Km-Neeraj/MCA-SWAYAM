//    Find the Number that Appears Once, and Other Numbers Appear Twice 
import java.util.*;
class Solution 
{
   static int singleNumber(int[]arr,int n)
   {
        for(int i=0;i<n;i++)
        {
                         int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]) 
                count++;
            }
            if(count==1)
            return arr[i];
        }
        return 0;
   }
}
public class SingleNumber {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int single=Solution.singleNumber(arr,n);
                            System.out.println("Unique number = "+single);
                            sc.close();


                         }
                         
}
