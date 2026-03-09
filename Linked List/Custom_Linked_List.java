// ===============================
// Linked List Implementation
// ===============================

public class Custom_Linked_List {

    // ===============================
    // Instance Variables
    // ===============================
    private Node head;
    private Node tail;
    private int size;

    // ===============================
    // Constructor
    // ===============================
    public Custom_Linked_List(int size){
        this.size = 0;
    }

    // ===============================
    // Insert at Beginning
    // ===============================
    public void insert(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    // ===============================
    // Insert at End
    // ===============================
    public void insertLast(int val){
        if(tail==null){
            insert(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // ===============================
    // Display Linked List
    // ===============================
    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }

        System.out.print("end");
    }

    // ===============================
    // Insert at Specific Index
    // ===============================
    public void index(int val,int index){

        if(index==0){
            insert(val);
            return;
        }

        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode  = new Node(val);

        newNode.next= temp.next;
        temp.next=newNode;

        size++;
    }

    // ===============================
    // Delete First Node
    // ===============================
    public int delfirst(){

        int val = head.val;

        head = head.next;

        if(head ==null){
            tail = null;
        }

        size--;

        return val;
    }

    // ===============================
    // Delete Last Node
    // ===============================
    public int  dellast(){

        if(size<=1){
            return delfirst();
        }

        Node secondLast = get(size-2);

        int val = tail.val;

        tail = secondLast;

        tail.next=null;

        return val ;
    }

    // ===============================
    // Delete Node at Index
    // ===============================
    public int delindex(int index){

        if (index==0){
            delfirst();
        }

        if (index == size-1){
            dellast();
        }

        Node prev = get(index-1);

        int val  =  prev.next.val;

        prev.next = prev.next.next;

        return val;
    }

    // ===============================
    // Get Node at Specific Index
    // ===============================
    public  Node get(int index){

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    // ===============================
    // Node Class (Inner Class)
    // ===============================
    private class Node {

        private int val;
        private Node next;

        public Node(int v) {
            this.val = v;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    // ===============================
    // Main Method (Testing Linked List)
    // ===============================
    public static void main(String[] args) {

        Custom_Linked_List list = new Custom_Linked_List(0);

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertLast(40);
        list.index(50,3);

        list.dellast();

        System.out.println(list.delfirst());

        // Linked_List_.Node n1 = list.new Node(100);
        // list.insert(n1); wont work as insert requires int and insert a node is not a good idea...

        System.out.println(list.size);

        list.display();
    }
}