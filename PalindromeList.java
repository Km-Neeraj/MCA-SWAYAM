import java.util.*;
class Solution 
{
    class Node 
    {
        int data;
        Node next;
        Node (int data)
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
    boolean isPalindrome()
    {
       if(head==null||head.next==null)
       {
         return true;
       }
       Node slow=head;
       Node fast=head;
       while(fast!=null&&fast.next!=null)
       {
          slow=slow.next;
          fast=fast.next.next;
       }
       Node prev=null;
       while(slow!=null)
       {
         Node next=slow.next;
         slow.next=prev;
         prev=slow;
         slow=next;
       }
       Node left=head;
       Node right=prev;
       while(right!=null)
       {
          if(left.data!=right.data)
                         return false;
         left=left.next;
         right=right.next;
       }
       return true;
    }
}
public class PalindromeList {
                         public static void main(String[] args) {
                                                  
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
                           
                           boolean res=list.isPalindrome();
                           if(res)
                           {
                              System.out.println("List is Palindrome");
                           }
                           else 
                           {
                                                  System.out.println("List is not Palindrome");
                           }
                           sc.close();
                         }
                         
}
