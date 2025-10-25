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
      ListNode deleteNode(ListNode head,int pos,int n)
      {
          if(head==null)
          return null;
          ListNode temp=head;
          for(int i=0;i<n-pos-1;i++)
          {
              temp=temp.next;
          }
          temp.next=temp.next.next;
          return head;

      }
}
public class DeleteNthNode {
                         public static void main(String[] args) {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             if(n==0)
                             {
                             System.out.println("List is empty");
                             return;
                             }
                             System.out.println("Enter Node");
                             ListNode head=new ListNode(sc.nextInt());
                             ListNode curr=head;
                             for(int i=1;i<n;i++)
                             {
                                curr.next=new ListNode(sc.nextInt());
                                curr=curr.next;
                             }
                             System.out.println("Enter position to delete node");
                             int pos=sc.nextInt();
                             Solution ob=new Solution();
                             head=ob.deleteNode(head,pos,n);
                             System.out.println("List after deleting elements");
                             curr=head;
                             while(curr!=null)
                             {
                                System.out.print(curr.data+" ");
                                curr=curr.next;
                             }
                             sc.close();
                         }
                         
}
