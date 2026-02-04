//import java.util.LinkedHashSet;
import java.util.*;
class Solution 
{

   static void union(int[]arr1,int n,int arr2[],int m)
   {
       
        int i=0,j=0;
        int lastPrinted=Integer.MIN_VALUE;
    
        while(i<n&&j<m)
        {
          if(arr1[i]<arr2[j])
          {
             if(arr1[i]!=lastPrinted)
             {
                 System.out.print(arr1[i]+" ");
                 lastPrinted=arr1[i];
             }
                i++;
          }
          else if(arr2[j]<arr1[i])
          {
              if(arr2[j]!=lastPrinted)
              {
                System.out.print(arr2[j]+" ");
                lastPrinted=arr2[j];
              }
              j++;
          }
          else
          {
              if(arr1[i]!=lastPrinted)
               {
                    System.out.print(arr1[i]+" ");
                    lastPrinted=arr1[i];
               }
               i++;
               j++;
          }
          
        }
        while(i<n)
        {
           if(arr1[i]!=lastPrinted)
           {
                  System.out.print(arr1[i]+" ");
                  lastPrinted=arr1[i];
                  
           }
           i++;
        }
        while(j<m)
        {
            if(arr2[j]!=lastPrinted)
            {
                System.out.print(arr2[j]+" ");
                lastPrinted=arr2[j];
                
            }
            j++;
        }

   }
}
public class Union1 {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter First Array size");
                            int n=sc.nextInt();
                            System.out.println("Enter Second Array Size");
                            int m=sc.nextInt();
                            int[]arr1=new int[n];
                            int []arr2=new int[m];

                            System.out.println("Enter first Array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr1[i]=sc.nextInt();
                            }

                            System.out.println("Enter Second Array elements");

                            for(int i=0;i<m;i++)
                            {
                              arr2[i]=sc.nextInt();
                            }
                          Solution.union(arr1,n,arr2, m);
                          
                          sc.close();
                         }
                         
}


/* Example:
    arr1[]={2,2,3,3,4};
    arr2[]={4, 5,5,5,5};
    
    Time Complexity = O(n + m)
    Space Complexity = o(1)
    
    
    
    */

   