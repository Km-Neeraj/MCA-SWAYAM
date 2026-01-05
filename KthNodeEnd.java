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
   void kthNode(int k)
   {
     Node fast=head;
     Node slow=head;
     if(head==null)
     {
                         System.out.println("List empty");
                         return;
     }
     for(int i=1;i<=k;i++)
     {
        if(fast==null)
        {
          System.out.println("List length is less than k");
          return;
        }
        fast=fast.next;
     }

   
   while(fast!=null)
   {
      slow=slow.next;
      fast=fast.next;
   }
   System.out.println("kth node from end = "+slow.data);
}
}
public class KthNodeEnd {
                         public static void main(String[] args) {
                                                  
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
                           list.display();
                           System.out.println("Enter kth number ");
                           int k=sc.nextInt();
                           list.kthNode(k);
                           sc.close();
                         }
                         
}
