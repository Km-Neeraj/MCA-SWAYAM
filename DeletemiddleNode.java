import java.util.*;
class ListNode 
{
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
ListNode deleteMiddle(ListNode head,int n)
     {
                         if(head==null||head.next==null)
                         return null;
        int mid=n/2;
        ListNode temp=head;
        for(int i=0;i<mid-1;i++)
        {
           temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
     }
}

public class DeletemiddleNode {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            if(n<0)
                            {
                               System.out.println("List is empty ");
                               return;
                            }
                            System.out.println("Enter Nodes");
                            ListNode head=new ListNode(sc.nextInt());
                            ListNode curr=head;
                            for(int i=1;i<n;i++)
                            {
                               curr.next=new ListNode(sc.nextInt());
                               curr=curr.next;

                            }
                            Solution ob=new Solution();
                            head=ob.deleteMiddle(head,n);
                            System.out.println("Elements after deleting middle element");
                           curr=head;
                            while(curr!=null)
                            {
                              System.out.print(curr.data+" ");
                              curr=curr.next;
                            }
                            sc.close();
                         }
                         
}
