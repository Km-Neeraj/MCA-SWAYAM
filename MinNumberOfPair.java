import java.util.*;
class Solution 
{
                         static int[]minPair(int[]arr,int n)
                         {
                             LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
                             for(int num:arr)
                             {
                                map.put(num,map.getOrDefault(num,0)+1);

                             }
                             int pairs=0;
                             int left=0;
                             for(Map.Entry<Integer,Integer> it:map.entrySet())
                             {
                                  pairs=pairs+it.getValue()/2;
                                  left=left+it.getValue()%2;
                             }
                             return new int[]{pairs,left};
                         }
}
public class MinNumberOfPair {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n;
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                 arr[i]=sc.nextInt();
                             }
                             int[]res=Solution.minPair(arr,n);
                             
                               System.out.print("["+res[0]+","+res[1]+"]");
                               sc.close();
                             
                         }
                         
}
