import java.util.*;
class Solution 
{
   static String sortCharacter(String s)
   {
      LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
      for(char ch:s.toCharArray())
      {
          map.put(ch,map.getOrDefault(ch,0)+1);
      }
      List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
      Collections.sort(list,(a,b)->b.getValue()-a.getValue());
      StringBuilder sb=new StringBuilder();
      for(Map.Entry<Character,Integer> it:list)
      {
         char ch=it.getKey();
         int freq=it.getValue();
         for(int i=0;i<freq;i++)
         {
              sb.append(ch);
         }
      }
      return sb.toString();

   }
}
public class sortCharactersByFrequency {

                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             s=sc.next();
                           String res=Solution.sortCharacter(s);
                           System.out.println("String after sorting according to the characters frequency in descending order = "+res);
                           sc.close();
                         }
                         
}
