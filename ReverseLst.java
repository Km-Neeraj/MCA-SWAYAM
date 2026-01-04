import java.util.*;
class Solution 
{
  class Node 
  {
     int data;
     Node next;
     Node(int data)
     {
      this.data=data;
      this.next=null;
     }
  }
  Node head=null;
  void insert(int data)
  {
    Node newNode=new Node(data);
    if(head==null)
    {
                         head=newNode;
                         return;
    }
    Node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=newNode;
  }
  void display()
  {
     Node temp=head;
     while(temp!=null)
     {
       System.out.print(temp.data+" ");
       temp=temp.next;
     }
     System.out.println();
  }
  void reverse()
  {
    Node prev=null;
    Node curr=head;
    while(curr!=null)
    {
      Node next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
    }
    head=prev;
  }
}
public class ReverseLst {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            Solution list=new Solution();
                            int n;
                            System.out.println("Enter number of nodes to create");
                            n=sc.nextInt();
                            for(int i=1;i<=n;i++)
                            {
                              System.out.println("Enter "+i+" Node: ");
                              int l=sc.nextInt();
                              list.insert(l);

                            }
                            System.out.println("List is");
                            list.display();
                            list.reverse();
                            System.out.println("List after reverse");
                            list.display();
                            sc.close();
                         }
                         
}
