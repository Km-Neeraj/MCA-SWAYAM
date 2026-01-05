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
   void middleNode()
   {
     Node fast=head;
     Node slow=head;
     while(fast!=null&&fast.next!=null)
     {
        slow=slow.next;
        fast=fast.next.next;
     }
     System.out.println("Elements from middle ");
     while(slow!=null)
     {
       System.out.print(slow.data+" ");
       slow=slow.next;
     }
   }
}
public class MiddleOfNode {
                         public static void main(String[]abc)
                         {
                           Scanner sc=new Scanner(System.in);
                           Solution list=new Solution();
                           System.out.println("Enter Number of nodes to create");
                           int n=sc.nextInt();
                           for(int i=1;i<=n;i++)
                           {
                              System.out.println("Enter "+i+" Node: ");
                              int l=sc.nextInt();
                              list.insert(l);
                           }
                           System.out.println("List is ");
                           list.display();
                           list.middleNode();
                           sc.close();
                         }
                         
}
