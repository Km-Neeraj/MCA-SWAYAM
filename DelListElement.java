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
                         void deleteNode(int data)
                         {
                            while(head!=null&&head.data==data)
                            {
                                 head=head.next;
                            }
                            Node temp=head;
                            while(temp!=null&&temp.next!=null)
                            {
                                if(temp.next.data==data)
                                {
                                                  temp.next=temp.next.next;
                                   
                                }
                                else 
                                {
                                                  temp=temp.next;
                                }

                            }
                         }
}
public class DelListElement {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            Solution list=new Solution();
                            System.out.println("Enter number of nodes to create");
                            int n=sc.nextInt();
                            for(int i=1;i<=n;i++)
                            {
                              System.out.println("Enter "+i+" Node: ");
                              int l=sc.nextInt();
                              list.insert(l);
                            }
                            System.out.println("List is");
                            list.display();
                            System.out.println("Enter node value to delete");
                            int l=sc.nextInt();
                            list.deleteNode(l);
                            System.out.println("List after deleting node having "+l+" value");
                            list.display();
                            sc.close();
                         }
                         
}
