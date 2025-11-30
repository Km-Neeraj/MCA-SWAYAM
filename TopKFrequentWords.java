import java.util.*;
class Solution 
{
   static ArrayList<String> topKFrequentWords(String[]arr,int n,int k)
   {
      LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
      for(String s:arr)
      {
         map.put(s,map.getOrDefault(s,0)+1);
      }
      List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
      Collections.sort(list,(a,b)->{
          if(!a.getValue().equals(b.getValue()))
          {
                         return b.getValue()-a.getValue();
          }
          return a.getKey().compareTo(b.getKey());
      });
      ArrayList<String> ans=new ArrayList<>();
      for(int i=0;i<k;i++)
      {
         ans.add(list.get(i).getKey());
      }
      return ans;
   }
}
public class TopKFrequentWords {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n;
                             n=sc.nextInt();
                             String[]arr=new String[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.next();
                             }
                             System.out.println("Enter k ");
                             int k=sc.nextInt();
                         ArrayList<String>res=Solution.topKFrequentWords(arr,n,k);
                         System.out.println(res);
                         sc.close();
                         }
                         
}
