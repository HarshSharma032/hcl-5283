package Collections;

public class Priority {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq =
                new java.util.PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}