import java.util.*;

class Solution
{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head1 = null;
    Node head2 = null;

    void insert1(int data)
    {
        Node newNode = new Node(data);
        if (head1 == null) {
            head1 = newNode;
            return;
        }
        Node temp = head1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void insert2(int data)
    {
        Node newNode = new Node(data);
        if (head2 == null) {
            head2 = newNode;
            return;
        }
        Node temp = head2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    Node merge()
    {
        Node temp = new Node(0);
        Node res = temp;
        Node l1 = head1;
        Node l2 = head2;

        while (l1 != null && l2 != null)
        {
            if (l1.data <= l2.data)
            {
                res.next = l1;
                l1 = l1.next;
            }
            else
            {
                res.next = l2;
                l2 = l2.next;
            }
            res = res.next;
        }

        if (l1 != null)
            res.next = l1;
        else
            res.next = l2;

        return temp.next;
    }

    void display(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MergeTwoSortedLists
{
    public static void main(String[] abc)
    {
        Scanner sc = new Scanner(System.in);
        Solution list = new Solution();

        System.out.println("Enter number of nodes in first list");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++)
        {
            int x = sc.nextInt();
            list.insert1(x);
        }

        System.out.println("Enter number of nodes in second list");
        int n2 = sc.nextInt();
        for (int i = 1; i <= n2; i++)
        {
            int x = sc.nextInt();
            list.insert2(x);
        }

        System.out.println("Merged List");
        Solution.Node merged = list.merge();
        list.display(merged);

        sc.close();
    }
}
