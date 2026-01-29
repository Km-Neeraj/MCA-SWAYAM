import java.util.Scanner;


class Solution 
{
                         static void selectionSort(int[]arr,int n)
                         {
                            
                              for(int i=0;i<n-1;i++)
                              {
                                                  int min_idx=i;
                                                  for(int j=i+1;j<n;j++)
                                                  {
                                                     if(arr[j]<arr[min_idx])
                                                     {
                                                                           min_idx=j;
                                                     }
                                                  }
                                                  int temp=arr[i];
                                                  arr[i]=arr[min_idx];
                                                  arr[min_idx]=temp;
                              }
                         }
}
public class SelectionSort {

                         public static void main(String[]abc)
                         {
                                                  Scanner sc=new Scanner(System.in);
                                                  System.out.println("enter size of an array");
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  System.out.println("Enter array elements");
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.nextInt();
                                                  }

                                                  Solution.selectionSort(arr,n);
                                                  System.out.println("array elements after sorting");
                                                  for(int num:arr)
                                                  {
                                                                           System.out.print(num+" ");
                                                  }
                                                  sc.close();
                         }
                         
}
