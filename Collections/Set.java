package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("Original Set: " + set);

        set.add(50);
        System.out.println("After add: " + set);

        set.add(20);
        System.out.println("After duplicate add: " + set);

        System.out.println("Contains 20: " + set.contains(20));

        System.out.println("Size: " + set.size());

        set.remove(30);
        System.out.println("After remove: " + set);

        System.out.println("Is empty: " + set.isEmpty());

        System.out.print("Enhanced loop: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println("Converted to ArrayList: " + list);

        Integer[] arr = set.toArray(new Integer[0]);
        System.out.print("Converted to Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);

        HashSet<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println("Union: " + union);

        HashSet<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> difference = new HashSet<>(set);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        System.out.println("Contains all: " + set.containsAll(set2));

        HashSet<Integer> copy = new HashSet<>(set);
        System.out.println("Copied Set: " + copy);

        set.clear();
        System.out.println("After clear: " + set);

        System.out.println("Is empty after clear: " + set.isEmpty());

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(30);
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(10);
        System.out.println("LinkedHashSet: " + linkedSet);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
        System.out.println("Lowest: " + treeSet.lower(30));
        System.out.println("Equal or lower: " + treeSet.floor(30));
        System.out.println("Equal or higher: " + treeSet.ceiling(25));
        System.out.println("Higher: " + treeSet.higher(30));

        System.out.println("HeadSet: " + treeSet.headSet(30));
        System.out.println("TailSet: " + treeSet.tailSet(30));
        System.out.println("SubSet: " + treeSet.subSet(10, 40));

        System.out.println("Descending Set: " + treeSet.descendingSet());

        treeSet.pollFirst();
        System.out.println("After pollFirst: " + treeSet);

        treeSet.pollLast();
        System.out.println("After pollLast: " + treeSet);

        sc.close();
    }
}

