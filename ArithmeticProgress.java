import java.util.*;
class Solution 
{
    static boolean result(int[]arr,int n)
    {
       Arrays.sort(arr);
       int res=arr[1]-arr[0];
       for(int i=2;i<n;i++)
       {
            if(arr[i]-arr[i-1]!=res)
            return false;
       }
       return true;
    }
}
public class ArithmeticProgress {
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
                            sc.close();
                            boolean res=Solution.result(arr,n);
                            if(res)
                            System.out.println("Possible");
                            else 
                            System.out.println("Not Possible");

                         }
                         
}
