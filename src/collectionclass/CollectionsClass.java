package collectionclass;

import java.util.ArrayList;
import java.util.Collections;

// collections class inbuilt methods for arraylist, linked list, list

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(200);
        al.add(100);
        al.add(50);
        al.add(300);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);


        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("Hello");
        al1.add("World");
        al1.add("Apple");
        al1.add("Chikoo");

        System.out.println(al1);
        Collections.sort(al1);
        System.out.println(al1);


        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);

        System.out.println(al2);

        // first data need to be sorted before applying binary search
        int index = Collections.binarySearch(al2,30); // if not found it'll send negative value
        System.out.println("Index is.. " +index);


        ArrayList al3 = new ArrayList();
        al3.add(10);
        al3.add(20);
        al3.add(20);
        al3.add(30);
        al3.add(40);
        al3.add(50);

        System.out.println(al3);
        Collections.rotate(al3, 1);
        System.out.println(al3);

        Collections.shuffle(al3); // Randomly organise data
        System.out.println(al3);

        int frequency = Collections.frequency(al3, 20);
        System.out.println(frequency);
    }

}
