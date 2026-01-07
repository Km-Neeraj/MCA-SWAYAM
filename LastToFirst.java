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
    void LastToFirst()
    {
       Node last=head;
       Node SLast=null;
       while(last.next!=null)
       {
          SLast=last;
          last=last.next;
       }
       SLast.next=null;
       last.next=head;
       head=last;
    }
}
public class LastToFirst {
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
                            list.LastToFirst();
                            System.out.println("List after making last to first");
                            list.display();
                            sc.close();
                         }

                         
}
