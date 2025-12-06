import java.util.*;
class Solution 
{
    static ArrayList<Integer> result(int[]arr,int n)
    {
       ArrayList<Integer> res=new ArrayList<>();
       for(int i=0;i<arr.length-1;i++)
       {
          int curr=arr[i];
          int next=arr[i+1];
          for(int j=curr+1;j<next;j++)
          {
                   res.add(j);      
          }

       }
       return res;
    }
}
public class MissingNum {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             ArrayList<Integer> res=Solution.result(arr,n);
                             System.out.print("MIssing Values = ");
                             System.out.println(res);
                             sc.close();
                         }
                         
}
