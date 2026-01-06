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
 void delAtPos(int n)
 {
    Node temp=new Node(0);
    temp.next=head;
    Node curr=temp;
    for(int i=0;i<=n;i++)
    {
       curr=curr.next;
    }
    Node res=temp;
    while(curr!=null)
    {
      res=res.next;
      curr=curr.next;  
    }
    res.next=res.next.next;
    head=temp.next;
 }
  

}
public class DelNthNode {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            Solution list=new Solution();
                            System.out.println("Enter number of nodes to create");
                            int n=sc.nextInt();
                            for(int i=1;i<=n;i++)
                            {
                               System.out.println("Enter "+i+" Node :");
                               int l=sc.nextInt();
                               list.insert(l);
                            }
                            System.out.println("List is");
                            list.display();
                            System.out.println("Enter the position to delete node from end");
                            int pos=sc.nextInt();
                            list.delAtPos(pos);
                            System.out.println("List after deleting node from nth position last");
                            list.display();
                            sc.close();
                         }
                         
}
