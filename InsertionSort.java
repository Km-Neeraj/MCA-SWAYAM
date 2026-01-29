import java.util.Scanner;


class Solution 
{
                         static void insertionSort(int[]arr,int n)
                         {
                            
                              for(int i=1;i<n;i++)
                              {
                                   int ky=arr[i];
                                   int j=i-1;
                                   while(j>=0&&arr[j]>ky)
                                   {
                                      arr[j+1]=arr[j];
                                      j=j-1;
                                   }
                                   arr[j+1]=ky;
                              }
                              
                         }
}
public class InsertionSort {

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

                                                  Solution.insertionSort(arr,n);
                                                  System.out.println("array elements after sorting");
                                                  for(int num:arr)
                                                  {
                                                                           System.out.print(num+" ");
                                                  }
                                                  sc.close();
                         }
                         
}
