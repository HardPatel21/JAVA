package collections.Qyu;

import java.util.PriorityQueue;

public class Qyuu {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        q.add(1);
        q.offer(22);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);

//        Iterator<Integer> i = q.iterator();
//        while (i.hasNext()) {
//            System.out.print(i.next() + ", ");
//        }
//        System.out.print("\b\b ");
//
//        q.clear();
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//        System.out.println(q.size());
//
//        q.clear();
//        System.out.println(q.isEmpty());
    }
}
/*
FIFO: First In First Out

Methods of Queue:
    1. add() - add element to the end of the Queue
    2. remove() - remove element from the front of the Queue (throws an exception if element not present)
    3. peek() - return the element at the front of the Queue
    4. poll() - rmeove the element at the front of the Queue (shows null if element not present)
    5. size() - return the number of elements in the Queue
    6. isEmpty() - return true if the Queue is empty
    7. clear() - remove all elements from the Queue


*/