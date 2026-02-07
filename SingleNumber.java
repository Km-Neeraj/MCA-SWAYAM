import java.util.*;
class Solution
{
   static int singleNumber(int[]arr,int n)
   {
       int xr=0;
       for(int num:arr)
       {
        xr=xr^num;
       }
       return xr;
   }                      
}

public class SingleNumber {
                         public static void main(String[] args) {
                                                  
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                     arr[i]=sc.nextInt();
                                                  }
                                     int num=Solution.singleNumber(arr,n);
                                     System.out.println("Single number = "+num);
                                     sc.close();
                         }
                         
}
