import java.util.*;
class Solution 
{
    static void sort(int[]arr,int n)
    {
       boolean flag;
       for(int i=0;i<n-1;i++)
       {
          flag=false;
          for(int j=0;j<n-i-1;j++)
          {
              if(arr[j]>arr[j+1])
                         {
                             int temp=arr[j];
                             arr[j]=arr[j+1];
                             arr[j+1]=temp;
                             flag=true;
                         } 
          }
          if(flag==false)
          {
             break;  
          }
       }
    }
}
public class BubbleSort {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            Solution.sort(arr,n);
                            
                            System.out.println("Sorted array");
                            for(int i=0;i<n;i++)
                            {
                                 System.out.print(arr[i]+" ");
                            }
                              sc.close();
                         }
                         
}
