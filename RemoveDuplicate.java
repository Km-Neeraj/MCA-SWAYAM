import java.util.*;
class Solution 
{
                         static int removeDuplicate(int[]arr,int n)
                         {
                                                  int j=1;
                             for(int i=1;i<n;i++)
                             {
                                if(arr[i]!=arr[i-1])
                                {
                                   arr[j++]=arr[i];
                                }
                                
                             }
                             return j;
                         } 
}
public class RemoveDuplicate {

                         public static void main(String[]abc)
                         {
                                                  Scanner sc=new Scanner(System.in );
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  System.out.println("Enter elements in sorted order");
                                                  for(int i=0;i<n;i++)
                                                  {
                                                     arr[i]=sc.nextInt();
                                                  }
                                                int num=  Solution.removeDuplicate(arr,n);
                                 System.out.println("Array elements after removing duplicate");
                                  for(int i=0;i<num;i++)
                                 {
                                                  System.out.print(arr[i]+" ");
                                 }
                                 sc.close();
                         }
                         
}
