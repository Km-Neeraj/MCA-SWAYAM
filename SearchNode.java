import java.util.*;
class ListNode{
     int data;
     ListNode next;

      ListNode(int data)
      {
        this.data=data;
        this.next=null;
      }
}
class Solution 
{
    boolean isExist(ListNode head,int n,int k)
    {
        if(head==null)
        {
           System.out.println("List is empty");
             return false;

        }
        ListNode temp=head;
        while(temp!=null)
        {
           if(temp.data==k)
           return true;
           temp=temp.next;

        }
        return false;
        
    }
}
public class SearchNode {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            if(n<0)
                            {
                            System.out.println("List is empty");
                            return;
                            }
                            System.out.println("Enter list Nodes");
                            ListNode head=new ListNode(sc.nextInt());
                            ListNode curr=head;
                            for(int i=1;i<n;i++)
                            {
                               curr.next=new ListNode(sc.nextInt());
                               curr=curr.next;
                            }
                            System.out.println("Enter node to search");
                            int k=sc.nextInt();
                            Solution ob=new Solution();
                            boolean res=ob.isExist(head,n,k);
                            if(res)
                            System.out.println("Yes Node Exist");
                            else 
                            System.out.println("No not present");
                            sc.close();
                         }
                         
}
