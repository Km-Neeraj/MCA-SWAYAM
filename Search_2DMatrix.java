//Search in 2D matrix
import java.util.*;
class Solution 
{
   static boolean search2D(int[][]arr,int target)
   {
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
           {
                  if(arr[i][j]==target)
                  {
                     return true;
                  }
           }
       } 
       return false;    
         

   }
}
public class Search_2DMatrix {
                         public static void main(String[]abc)
                         {
                            int n,m;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of row and column");
                            n=sc.nextInt();
                            m=sc.nextInt();
                            int[][]arr=new int[n][m];
                            System.out.println("Enter Array Elements");

                            for(int i=0;i<n;i++)
                            {
                               for(int j=0;j<m;j++)
                               {
                                  arr[i][j]=sc.nextInt();
                               }
                            }
                            System.out.println("Enter number to search in 2D matrix");
                            int key=sc.nextInt();
                            boolean res=Solution.search2D(arr,key);
                            if(res)
                            {
                               System.out.println(key+" is present in matrix");
                            }
                            else 
                            {
                              System.out.println(key+" is not present in an array");
                            }
                            sc.close();
                         }
                         
}
