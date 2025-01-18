package collectioninterface;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet ts =new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(70);
        ts.add(10);
        System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.lower(50));

        System.out.println(ts.ceiling(40)); //
        System.out.println(ts.floor(40));  //

        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));
    }
}
