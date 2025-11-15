import java.util.*;
class Solution{
   static int result(int[]arr,int n)
   {
                         if(n<=3 || n==0)
                         return 0;
      ArrayList<Integer> even = new ArrayList<>();
      ArrayList<Integer> odd=new ArrayList<>();
      even.add(arr[0]);
      for(int i=1;i<n;i++)
      {
           if(i%2==0)
           {
             even.add(arr[i]);
           }
           else 
           {
               odd.add(arr[i]);
           }
      }
      Collections.sort(even);
      int sum1=even.get(even.size()-2);
      Collections.sort(odd);
      int sum2=odd.get(1);
    int res=sum1+sum2;
   return res;
   }
}
public class Accenture5 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                         int[]arr=new int[n];
                         for(int i=0;i<n;i++)
                         {
                            arr[i]=sc.nextInt();
                         }
    int res=Solution.result(arr,n);
    System.out.println("Result = "+res);
    sc.close();

                         }
                         
}
