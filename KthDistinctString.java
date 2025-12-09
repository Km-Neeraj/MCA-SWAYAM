import java.util.*;
class Solution 
{
   static String result(String[]arr,int n,int k)
   {
      LinkedHashMap<String,Integer> res=new LinkedHashMap<>();
      for(String s:arr)
      {
         res.put(s,res.getOrDefault(s,0)+1);
      }
      LinkedHashSet<String> r=new LinkedHashSet<>();
      for(Map.Entry<String,Integer> it:res.entrySet())
      {
        if(it.getValue()==1)
        {
                         r.add(it.getKey());
        }
      }
      int c=0;
      for(String s:r)
       {
           c++;
           if(c==k)
                         {
                             return s;
                         }              
       }
       return "";
   }
}
public class KthDistinctString {
                         public static void main(String[] args) {
                                                  
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  String[]arr=new String[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.next();
                                                  }
                                                  System.out.println("Enter k value");
                                                  int k=sc.nextInt();
                             String res=Solution.result(arr,n,k);
                             System.out.println("kth Distinct String = "+res);
                             sc.close();
                         }
                         
}
