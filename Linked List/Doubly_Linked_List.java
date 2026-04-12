public class Doubly_Linked_List {

    Node head;
    Node tail;
    int size;

    public Doubly_Linked_List(){
        this.size = 0;
    }

    // DELETE LAST
    public void delend(){

        if(head == null){
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // DELETE FIRST
    public void delfirst(){

        if(head == null){
            return;
        }

        head = head.next;

        if(head != null){
            head.prev = null;
        }
        else{
            tail = null;
        }

        size--;
    }

    // INSERT AT INDEX
    public void insertIndex(int val,int index){

        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 0; i < index-1; i++){
            temp = temp.next;
        }

        Node node = new Node(val);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next = node;

        size++;
    }

    // INSERT LAST
    public void insertLast(int val){

        Node node = new Node(val);

        if(tail == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.prev = tail;

        tail = node;

        size++;
    }

    // INSERT FIRST
    public void insertFirst(int val){

        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }

        head = node;

        if(tail == null){
            tail = node;
        }

        size++;
    }

    // DISPLAY FORWARD
    public void display(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    // DISPLAY REVERSE
    public void displayrev(){

        Node temp = tail;

        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.prev;
        }

        System.out.println("END");
    }

    // NODE CLASS
    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Doubly_Linked_List list = new Doubly_Linked_List();

        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(11);
        list.insertLast(19);

        list.display();
        list.displayrev();
    }
}