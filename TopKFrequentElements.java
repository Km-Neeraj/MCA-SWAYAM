import java.util.*;
class Solution 
{
   static ArrayList<Integer> topKFrequentElements(int[]arr,int n,int k)
   {
       LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
       for(int num:arr)
       {
          map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
       Collections.sort(list,(a,b)->b.getValue()-a.getValue());
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=0;i<k;i++)
       {
             res.add(list.get(i).getKey());
       }
       return res;
   }
}
public class TopKFrequentElements {
                         public static void main(String[] args) {
                                                  
                           Scanner sc=new Scanner(System.in);
                           int n;
                           n=sc.nextInt();
                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                           {
                              arr[i]=sc.nextInt();
                           }
                           System.out.print(":Enter k");
                           int k=sc.nextInt();
                         ArrayList<Integer>res=Solution.topKFrequentElements(arr,n,k);
                         
                            System.out.println(res);
                         
                         sc.close();
                         }
                         
}
