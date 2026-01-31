import java.util.*;

public class JavaCollections {

    public static void main(String[] args) {

        // Uncomment the method you want to test

        // arrayListDemo();
        // iteratorDemo();
        // stackDemo();
        // queueDemo();
        // listIteratorDemo();
        // priorityQueueDemo();
        // arrayDequeDemo();
        // hashSetDemo();
        // linkedHashSetDemo();

    }

    // --------------------------------------------------
    // 1️⃣ ArrayList Demo
    // - Dynamic array, resizable
    // - Stores duplicates
    // - Index-based access
    // --------------------------------------------------
    static void arrayListDemo() {
        ArrayList<String> students = new ArrayList<>();
        students.add(0, "Ram");       // add at index 0
        students.add("Sita");         // add at end
        students.add("Rohan");
        students.set(0, "Rohit");     // update index 0
        students.remove(1);           // remove element at index 1
        students.add("Ring");
        students.add("Razor");
        students.add("Rose");

        // print all elements
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    // --------------------------------------------------
    // 2️⃣ Iterator Demo
    // - Used to traverse collections
    // - Only forward traversal
    // --------------------------------------------------
    static void iteratorDemo() {
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Ram", "Sita", "Rohan"));
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // --------------------------------------------------
    // 3️⃣ Stack Demo
    // - LIFO (Last In First Out)
    // - push(), pop(), peek()
    // --------------------------------------------------
    static void stackDemo() {
        Stack<String> stack = new Stack<>();
        stack.push("Cat");
        stack.push("Cat2");
        stack.push("Cat3");
        stack.push("Cat4");

        stack.pop();                  // removes top element
        System.out.println(stack.peek());  // view top element
        System.out.println(stack);
    }

    // --------------------------------------------------
    // 4️⃣ Queue Demo (LinkedList)
    // - FIFO (First In First Out)
    // - offer(), poll(), peek()
    // --------------------------------------------------
    static void queueDemo() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(122);
        queue.offer(111);

        queue.poll();                 // removes first element
        System.out.println(queue);
        System.out.println(queue.peek()); // view first element
    }

    // --------------------------------------------------
    // 5️⃣ ListIterator Demo
    // - Can traverse forward and backward
    // --------------------------------------------------
    static void listIteratorDemo() {
        List<Integer> list = new LinkedList<>(Arrays.asList(10, 20, 30, 22));

        ListIterator<Integer> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    // --------------------------------------------------
    // 6️⃣ PriorityQueue Demo
    // - Elements ordered by priority (smallest first by default)
    // - offer(), poll()
    // --------------------------------------------------
    static void priorityQueueDemo() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(120);
        pq.offer(2);
        pq.offer(14);
        pq.offer(16);

        System.out.println("Initial PQ: " + pq);

        pq.poll();                    // removes smallest
        pq.add(33);
        pq.add(17);

        System.out.println("Updated PQ: " + pq);
    }

    // --------------------------------------------------
    // 7️⃣ ArrayDeque Demo
    // - Can add/remove from both ends
    // - offerFirst(), offerLast(), pollFirst(), pollLast()
    // --------------------------------------------------
    static void arrayDequeDemo() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(111);
        deque.offerFirst(112);
        deque.offerLast(1);
        deque.offerLast(20);

        System.out.println("Deque: " + deque);

        deque.pollFirst();
        deque.pollLast();

        System.out.println("After poll: " + deque);
    }

    // --------------------------------------------------
    // 8️⃣ HashSet Demo
    // - Stores unique elements
    // - No insertion order
    // --------------------------------------------------
    static void hashSetDemo() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(11);
        hashSet.add(12);  // duplicate ignored

        System.out.println("HashSet: " + hashSet);
    }

    // --------------------------------------------------
    // 9️⃣ LinkedHashSet Demo
    // - Stores unique elements
    // - Maintains insertion order
    // --------------------------------------------------
    static void linkedHashSetDemo() {
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(20);

        System.out.println("LinkedHashSet: " + linkedSet); // [30, 10, 20]
    }
}
