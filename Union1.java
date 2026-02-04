//import java.util.LinkedHashSet;
import java.util.*;
class Solution 
{

  static boolean binarySearch(int[]arr1,int key)
  {
     int low=0,high=arr1.length-1;

     while(low<=high)
     {
        int mid=low+(high-low)/2;

        if(arr1[mid]==key)
                         return true;
         else if(arr1[mid]<key)
               low=mid+1;
          else 
                         high=mid-1;
     }
     return false;
  }




   static void union(int[]arr1,int n,int arr2[],int m)
   {
       Arrays.sort(arr1);
       int lastPrinted=Integer.MIN_VALUE;  // For tracking duplicate Values
       for(int num:arr1)
       {
            if(num!=lastPrinted)
                         {
                                   System.out.print(num+" ");
                                   lastPrinted=num;
                         }
            
           
       }
        
        for(int i=0;i<m;i++)
        {
             if(!binarySearch(arr1,arr2[i])&&arr2[i]!=lastPrinted)
             {
                         System.out.print(arr2[i]+" ");
                         lastPrinted=arr2[i];
             }
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
    */

    /* Time: O(n log n + m log n)

Space: O(1) (no extra data structure)  

O(n log n)   // sorting
+ O(n)      // printing arr1
+ O(m log n)// searching arr2

Drop smaller terms (DSA rule)

O(n) is smaller than O(n log n)

Final Time Complexity:

O(n log n + m log n)










*/