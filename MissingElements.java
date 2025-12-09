import java.util.*;
class Solution 
{
  static ArrayList<Integer> result(int[]arr,int n)
  {
      ArrayList<Integer> res=new ArrayList<>();
      int small=arr[0];
      int big=arr[0];
      for(int i=1;i<arr.length;i++)
      {
         if(arr[i]>big)
             big=arr[i];
          if(arr[i]<small)
                         small=arr[i];
      }
      for(int i=small;i<=big;i++)
      {
         boolean flag=true;
         for(int j=0;j<n;j++)
         {
              if(arr[j]==i)
              {
                         flag=false;
                         break;
              }
         }
         if(flag==true)
         {
                         res.add(i);
         }
      }
      return res;
  }
}
public class MissingElements {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                         {
                         arr[i]=sc.nextInt();
                         } 
                  ArrayList<Integer> res=Solution.result(arr,n);
                  System.out.println(res);
                  sc.close();

                         }
                         
}
