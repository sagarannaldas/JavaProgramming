package collectioninterface;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(299);
        System.out.println(ad1);

        ad1.addFirst(10);
        ad1.addLast(20);

        System.out.println(ad1);
        ad1.add("PW");

        ad1.offerFirst(300);
        ad1.offerLast(122);
        System.out.println(ad1);
    }
}
