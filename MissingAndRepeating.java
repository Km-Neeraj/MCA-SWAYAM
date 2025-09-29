import java.util.*;
class Solution 
{
     static ArrayList<Integer> missingRepeating(int[][]arr,int n)
     {
          ArrayList<Integer> res=new ArrayList<>();
                         int t=n*n;

          int[]freq=new int[t+1];
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
                    freq[arr[i][j]]++;
              }
          }
          int m=-1,r=-1;
          for(int i=1;i<=t;i++)
          {
               if(freq[i]==2)
               r=i;
               if(freq[i]==0)
               m=i;
          }
          res.add(m);
          res.add(r);
          return res;
     }
}
public class MissingAndRepeating {
                         public static void main(String[] args) {
                         
                           int n;
                           Scanner sc=new Scanner(System.in);
                           n=sc.nextInt();
                           int[][]arr=new int[n][n];
                           for(int i=0;i<n;i++)
                           {
                             for(int j=0;j<n;j++)
                             {
                                arr[i][j]=sc.nextInt();
                             }
                           }
                           ArrayList<Integer> res=Solution.missingRepeating(arr,n);
                           System.out.println(res);
                           sc.close();
                                                  
                         }
                         
}
