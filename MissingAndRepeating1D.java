import java.util.*;
class Solution 
{
   static ArrayList<Integer> missRepeating(int[]arr,int n)
   {
        ArrayList<Integer> res=new ArrayList<>();
        int s=(n*(n+1))/2;
        int ss=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<n;i++)
        {
            s=s-arr[i];
            ss=ss-arr[i]*arr[i];
        }
        int m=0,r=0;
         m=(s+ss/s)/2;
         r=m-s;
        res.add(m);
        res.add(r);
        return res;
   }
}
public class MissingAndRepeating1D {
                         public static void main(String[] args) {
                         int n;
                         Scanner sc=new Scanner(System.in);
                         n=sc.nextInt();
                         int[]arr=new int[n];
                         for(int i=0;i<n;i++)
                         {
                             arr[i]=sc.nextInt();
                         }
                         ArrayList<Integer> res=Solution.missRepeating(arr,n);
                         System.out.println(res);
                         sc.close();
                                                  
                         }
                         
}
