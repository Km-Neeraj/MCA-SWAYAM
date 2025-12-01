import java.util.*;
class Solution 
{
   static ArrayList<String> highestFreqCombination(String s)
   {
      String[]words=s.trim().split("\\s+");
      LinkedHashMap<String,Integer> freq=new LinkedHashMap<>();
      ArrayList<String> combination=new ArrayList<>();
      for(String c:words)
      {
          String ch=""+c.charAt(0)+c.charAt(c.length()-1);
          combination.add(ch);
          freq.put(ch,freq.getOrDefault(ch,0)+1);
      }
      int max=Collections.max(freq.values());
      LinkedHashSet<String> res=new LinkedHashSet<>();
      for(String sb:combination)
      {
          if(freq.get(sb)==max)
          {
              res.add(sb);
          }
      }
      return new ArrayList<>(res);
   }
}

public class HighestFrequency {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            String s;
                            s=sc.nextLine();
                         ArrayList<String> res=Solution.highestFreqCombination(s);
                         System.out.println(res);
                         sc.close();
                         }
                         
}
