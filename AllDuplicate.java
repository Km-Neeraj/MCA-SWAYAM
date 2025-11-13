import java.util.*;
class Solution 
{
    static String duplicate(String s)
    {
       LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
       for(char ch:s.toCharArray())
       {
          map.put(ch,map.getOrDefault(ch,0)+1);

       }
       StringBuilder res=new StringBuilder();
       for(Map.Entry<Character,Integer> ch: map.entrySet())
       {
           if(ch.getValue()>1)
           {
                         res.append(ch.getKey());
           }
       }
       return res.toString();
    }
}
public class AllDuplicate {
                         public static void main(String[] args) {
                                                  
                               String s;
                               Scanner sc=new Scanner(System.in);
                               s=sc.next();
                               String res=Solution.duplicate(s);
                               System.out.println("All Duplicate input in String = "+res);
                               sc.close();
                         }
                         
}
