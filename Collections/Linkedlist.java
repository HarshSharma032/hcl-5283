package Collections;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List: " + list);


        int k = 20;
        int element = 25;

        int index = list.indexOf(k);

        if (index != -1) {
            list.add(index + 1, element);
        }

        System.out.println(list);

        list.add(1, 15);
        System.out.println("After insertion: " + list);

        list.addFirst(5);
        System.out.println("After addFirst: " + list);

        list.addLast(50);
        System.out.println("After addLast: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        System.out.println("First element: " + list.getFirst());

        System.out.println("Last element: " + list.getLast());

        list.set(0, 1);
        System.out.println("After update: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Contains 20: " + list.contains(20));

        System.out.println("Index of 30: " + list.indexOf(30));

        list.add(20);
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        list.remove(0);
        System.out.println("After removing index 0: " + list);

        list.remove(Integer.valueOf(20));
        System.out.println("After removing value 20: " + list);

        list.removeFirst();
        System.out.println("After removeFirst: " + list);

        list.removeLast();
        System.out.println("After removeLast: " + list);

        System.out.println("Peek: " + list.peek());

        System.out.println("Peek First: " + list.peekFirst());

        System.out.println("Peek Last: " + list.peekLast());

        list.offer(100);
        System.out.println("After offer: " + list);

        list.offerFirst(5);
        System.out.println("After offerFirst: " + list);

        list.offerLast(200);
        System.out.println("After offerLast: " + list);

        System.out.println("Element: " + list.element());

        System.out.println("Poll: " + list.poll());
        System.out.println("After poll: " + list);

        System.out.println("Poll First: " + list.pollFirst());
        System.out.println("After pollFirst: " + list);

        System.out.println("Poll Last: " + list.pollLast());
        System.out.println("After pollLast: " + list);

        list.push(500);
        System.out.println("After push: " + list);

        System.out.println("Pop: " + list.pop());
        System.out.println("After pop: " + list);

        System.out.print("Normal loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.print("Enhanced loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println("Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);

        if (!list.isEmpty()) {
            System.out.println("Minimum: " + Collections.min(list));
            System.out.println("Maximum: " + Collections.max(list));
        }

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.swap(list, 0, list.size() - 1);
        System.out.println("After swap: " + list);

        System.out.println("Is empty: " + list.isEmpty());

        Integer[] arr = list.toArray(new Integer[0]);

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(100);
        list2.add(200);

        list.addAll(list2);
        System.out.println("After addAll: " + list);

        System.out.println("Contains all: " + list.containsAll(list2));

        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(10);
        list3.add(30);
        list3.add(500);

        list.retainAll(list3);
        System.out.println("Common elements: " + list);

        LinkedList<Integer> copy = new LinkedList<>(list);
        System.out.println("Copied List: " + copy);

        if (list.size() >= 2) {
            System.out.println("SubList: " + list.subList(0, 2));
        }

        list.clear();
        System.out.println("After clear: " + list);

        System.out.println("Poll on empty list: " + list.poll());

        System.out.println("Peek on empty list: " + list.peek());

        sc.close();
    }
}
