package Collections;
import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<Integer, String> mp1 = new HashMap<>();
        mp1.put(1, "Sumit");
        mp1.put(2, "Sujit");
        mp1.put(3, "Abhi");
        System.out.println("HashMap: " + mp1);

        Map<Integer, String> mp2 = new LinkedHashMap<>();
        mp2.put(1, "Sumit");
        mp2.put(2, "Sujit");
        mp2.put(3, "Abhi");
        System.out.println("LinkedHashMap: " + mp2);

        Map<Integer, String> mp3 = new TreeMap<>();
        mp3.put(3, "Abhi");
        mp3.put(1, "Sumit");
        mp3.put(2, "Sujit");
        System.out.println("TreeMap: " + mp3);

        Map<Integer, String> mp4 = new Hashtable<>();
        mp4.put(1, "Sumit");
        mp4.put(2, "Sujit");
        mp4.put(3, "Abhi");
        System.out.println("Hashtable: " + mp4);
    }
}