import java.util.*;
class Solution 
{
   static int maxConsecutive(int[]arr,int n)
   {
      Arrays.sort(arr);

      int curr=1,longest=1;
       for(int i=1;i<n;i++)
       {
          if(arr[i]==arr[i-1]+1)
          curr++;
          else if(arr[i]!=arr[i-1])
          curr=1;
          longest=Math.max(longest,curr);
       }
       return longest;

   }
}
public class LongestConsecutive1 {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int max=Solution.maxConsecutive(arr,n);
                            System.out.println("Maximum consecutive = "+max);
                            sc.close();
                         }
                         
}
