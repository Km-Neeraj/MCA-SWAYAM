import java.util.*;
class Solution 
{
    static int linearSearch(int[]arr,int n,int key)
    {
        for(int i=0;i<n;i++)
        {
          if(arr[i]==key)
          {
                         return i+1;
          }
        }
        return -1;
    }
}
public class Linear {

                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();

                            }
                            System.out.println("Enter key to search");
                            int key=sc.nextInt();
                            int idx=Solution.linearSearch(arr,n,key);
                            if(idx==-1)
                            {
                                                  System.out.println(key+" Element not present in the array");

                            }
                            else 
                            {
                               System.out.println(key+" found at "+idx+" Position");

                            }
                            sc.close();
                         }
                         
}
