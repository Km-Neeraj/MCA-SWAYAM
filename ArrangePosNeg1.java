import java.util.*;
class Solution 
{
    static ArrayList<Integer> reArrange(int[]arr,int n)
    {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
           if(arr[i]>=0)
           {
                pos.add(arr[i]);
           }
           else 
           {
               neg.add(arr[i]);
           }
        }
        int posIdx=0,negIdx=0;
        int i=0;
        while(posIdx<pos.size()&&negIdx<neg.size())
        {
           if(i%2==0)
           {
           res.add(pos.get(posIdx++));
           i++;
           }
           else 
           {
           res.add(neg.get(negIdx++));
           i++;
           }
           
        }
        while(posIdx<pos.size())
        
        res.add(pos.get(posIdx++));
        
        while(negIdx<neg.size())
        res.add(neg.get(negIdx++));
        return res;
    }
}
public class ArrangePosNeg1 {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            ArrayList<Integer> res=Solution.reArrange(arr,n);
                            System.out.print(res);
                            sc.close();
                         }
                         
}
