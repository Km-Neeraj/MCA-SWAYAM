import java.util.*;
class Solution 
{
    static void missingAndRepeating(int[]arr,int n)
    {
         int[]count=new int[n+1];
         for(int i=0;i<n;i++)
         {
                         count[arr[i]]++;
         }
         int miss=-1;
         int repeat=-1;
         for(int i=1;i<=n;i++)
         {
                         if(count[i]==0)
                          miss=i;
                         else if(count[i]==2)
                           repeat=i;
         }
         System.out.println("Repeating = "+repeat);
         System.out.println("Missing = "+miss);

    }
}
public class MissingAndRepeating {

                              public static void main(String[]abc)
                              {
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  System.out.println("Enter Array elements");
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.nextInt();
                                                  }
                                                  Solution.missingAndRepeating(arr,n);
                                                  sc.close();

                              }
                         
}
