import java.util.*;
class Solution 
{
    static int numberOfOperation(ArrayList<Integer> arr)
      {
          int count=0;
          while(!arr.isEmpty())
          {
               int min=Collections.min(arr);
               if(arr.get(0)==min)
               {
                  arr.remove(0);
               }
               else 
               {
                     int first=arr.remove(0);
                     arr.add(first);
               }
               count++;
          }  
          return count;          
      }
}
public class Assesment2 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             ArrayList<Integer> arr=new ArrayList<>();
                             for(int i=0;i<n;i++)
                             {
                                arr.add(sc.nextInt());
                             }
                             int count=Solution.numberOfOperation(arr);
                             System.out.println("number of operation = "+count);
                             sc.close();
                         }
                         
}
