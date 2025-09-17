// Left Rotate an Array by D Places 
import java.util.*;
class Solution 
{ 
                          static int[] leftRotateByDPlaces(int[]arr,int n,int d)
                          {
                                 int[]res=new int[n];
                                 int j=0;
                                 for(int i=d;i<n;i++)
                                 {
                                                  res[j]=arr[i];
                                                  j++;
                                 }
                                 for(int i=0;i<d;i++)
                                 {
                                    res[j]=arr[i];
                                    j++;
                                 }
                                 return res;
                          }

}
public class LeftRotateByDPlaces {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter Number of an Array Element");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array Elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();

                            }
                            System.out.println("Enter the place value of left Rotation");
                            int d=sc.nextInt();
                            int[]res=Solution.leftRotateByDPlaces(arr,n,d);
                            for(int i=0;i<n;i++)
                            {
                              System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
