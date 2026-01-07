import java.util.Scanner;
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
    void removeDuplicate()
    {
      Node temp=head;

      while(temp!=null)
      {
         Node curr=temp;
         while(curr.next!=null)
         {
                         if(curr.next.data==temp.data)
                         {
                            curr.next=curr.next.next;
                         }
                         else 
                         {
                                                  curr=curr.next;
                         }
}
         
         temp=temp.next;


      }

}
}

public class RemoveUnsortedList {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            Solution list=new Solution();
                            System.out.println("Enter number of nodes to create");
                            int n=sc.nextInt();
                            for(int i=1;i<=n;i++)
                            {
                               System.out.println("Enter"+i+" Node : ");
                               int l=sc.nextInt();
                               list.insert(l);
                            }
                            System.out.println("List is ");
                            list.display();
                            list.removeDuplicate();
                            System.out.println("List after deleting duplicate");
                            list.display();
                            sc.close();
                         }

                         
}

                         

