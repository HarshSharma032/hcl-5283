package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List: " + list);

        list.add(1, 15);
        System.out.println("After insertion: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(0, 5);
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

        System.out.println("Is empty: " + list.isEmpty());

        Integer[] arr = list.toArray(new Integer[0]);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);

        list.addAll(list2);
        System.out.println("After addAll: " + list);

        System.out.println("Contains all: " + list.containsAll(list2));

        list.removeAll(list2);
        System.out.println("After removeAll: " + list);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(30);
        list3.add(500);

        list.retainAll(list3);
        System.out.println("Common elements: " + list);

        list.clear();
        System.out.println("After clear: " + list);

        sc.close();
    }
}