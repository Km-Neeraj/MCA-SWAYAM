import java.util.*;
class Solution 
{
     static int[] moveZeros(int[]arr,int n)
     {
        int[]res=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
          if(arr[i]!=0)
          {
             res[j++]=arr[i];
          }
        }
        return res;
     }
}
public class MoveZeros {
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
                            int[]res=Solution.moveZeros(arr,n);
                            for(int i=0;i<n;i++)
                            {
                               System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
