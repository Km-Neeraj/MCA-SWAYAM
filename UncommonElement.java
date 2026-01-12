import java.util.*;
class Solution 
{
   static void uncommon(int[]arr1,int n1,int[]arr2,int n2)
   {
       for(int i=0;i<n1;i++)
       {
         boolean flag=false;
         for(int j=0;j<n2;j++)
         {
           if(arr1[i]==arr2[j])
           {
              flag=true;
              break;
           }
         }
         if(!flag)
         {
            System.out.print(arr1[i]+" ");
         }
       }
       for(int i=0;i<n2;i++)
       {
          boolean flag=false;
          for(int j=0;j<n1;j++)
          {
             if(arr2[i]==arr1[j])
             {
                         flag=true;
                         break;
             }
          }
          if(!flag)
          {
             System.out.print(arr2[i]+" ");
          }
       }
       
   }
}
public class UncommonElement {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter n for array1 ");
                            int n1=sc.nextInt();
                            System.out.println("Enter num2 for array 2");
                            int n2=sc.nextInt();
                            System.out.println("Enter first array elements ");
                            int[]arr1=new int[n1];
                            int[]arr2=new int[n2];

                            for(int i=0;i<n1;i++)
                            {
                               arr1[i]=sc.nextInt(); 
                            }
                            System.out.println("Enter second array elements ");
                            for(int i=0;i<n2;i++)
                            {
                               arr2[i]=sc.nextInt();
                            }
                            Solution.uncommon(arr1,n1,arr2,n2);
                            sc.close();
                         }
                         
}
