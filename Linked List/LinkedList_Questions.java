import java.util.HashSet;

public class LinkedList_Questions {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Head of list
    ListNode head;

    // Insert at beginning
    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
    }

    // Insert at end
    public void insertLast(int val) {

        ListNode node = new ListNode(val);

        if (head == null) {
            head = node;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }

    // Display Linked List
    public void display() {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    //1. Reverse Linked List
    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode prev =null;
        ListNode next = null;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
        
    }


    public static void main(String[] args) {

        LinkedList_Questions list = new LinkedList_Questions();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);

        System.out.println("Original List:");
        list.display();

        list.head = list.reverseList(list.head);

        System.out.println("Reversed List:");
        list.display();
    }
}