/*  First input is the number of an array elements
    Then Enter Elements in an array
      > if first element of an array is smallest remove it 
      > Otherwise shift first element in last 
      > count the number of operation to until becomes  empty. 
  
*/
import java.util.*;
class Solution 
{
   static int numberOfOperation(int[]arr,int n)
   {
       int count=0;
       while(n>0)
       {
           int min=arr[0];
            for(int i=1;i<n;i++)
            {
                if(arr[i]<min)
                min=arr[i];
            }
            if(arr[0]==min)
            {
                for(int i=0;i<n-1;i++)
                {
                  arr[i]=arr[i+1];
                }
                n--;
            }
            else 
            {
               int first=arr[0];
                 for(int i=0;i<n-1;i++)
                 {
                    arr[i]=arr[i+1];
                 }
                 arr[n-1]=first;
            }
            count++;
       }
       return count;
   }
}
public class Assement1 {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int count=Solution.numberOfOperation(arr,n);
                            System.out.println("Number of Operation = "+count);
                            sc.close();
                         }
                         
}
