import java.util.Scanner;
class Solution 
{
   static int[]result(int[]arr,int n,int target)
   {
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
             int sum=arr[i]+arr[j];
           if(sum==target)
           return new int[]{i,j};
           

          }
      }
      return new int[]{};
   }
}
public class twoSum3 {

                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array elements ");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                         }
                         System.out.println("Enter Target value");
                         int target=sc.nextInt();
                         int[] res=Solution.result(arr,n,target);
                         if(res.length==2)
                         System.out.println("Value at int index "+res[0]+" = "+arr[res[0]]+" and value at index "+res[1]+" = "+arr[res[1]]+" = target sum "+target);
                         else 
                         System.out.println("No such pair of index exist");
                         
                         
                         sc.close();
 }
                         
}


                         


                         

