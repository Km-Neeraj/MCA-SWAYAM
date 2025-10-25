import java.util.*;
class ListNode{
    int val;
    ListNode next;

       ListNode(int val)
       {
          this.val=val;
          this.next=null;
       }
}
class Solution 
{
    ListNode middleElement(ListNode head,int n)
    {

       int mid=n/2;
       ListNode temp=head;
       for(int i=0;i<mid;i++)
       {
           temp=temp.next;
       }
       return temp;
    }
}
public class MiddleOfList {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of nodes");
                            n=sc.nextInt();
                            System.out.println("Enter nodes");
                            ListNode head=new ListNode(sc.nextInt());
                            ListNode curr=head;
                            for(int i=1;i<n;i++)
                            {
                               curr.next=new ListNode(sc.nextInt());
                               curr=curr.next;
                            }
                            Solution ob=new Solution();
                            ListNode middle=ob.middleElement(head,n);
                            System.out.println("Output = ");
                            while(middle!=null)
                            {
                                  System.out.print(middle.val+" ");
                                  middle=middle.next;
                            }
                            sc.close();

                         }
                         
}
