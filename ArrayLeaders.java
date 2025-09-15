//print all leaders
import java.util.*;
class Solution 
{
   static ArrayList<Integer> leaders(int[]arr,int n)
   {
       ArrayList<Integer> res=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
             int j;
           for(j=i+1;j<n;j++)
           {
               if(arr[i]<=arr[j])
               break;

           }
           if(j==n)
           {
                         res.add(arr[i]);
           }
       }
       return res;
   }
}
public class ArrayLeaders {
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
                            ArrayList<Integer> res=Solution.leaders(arr,n);
                            System.out.print(res);
                            sc.close();
                         }
                         
}
