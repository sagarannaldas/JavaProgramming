package collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(100);
        al.add("abcd");
        al.add(200);
        al.add(300);
        System.out.println(al);

        System.out.println("-------------------");

        ArrayList al1 = new ArrayList();
        al1.add("PWSkills");
        al1.add('l');
        al1.add(20);
        al1.add(1.1);
        System.out.println(al1);

        System.out.println("-------------------");

        ArrayList al2 = new ArrayList();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.addAll(al1);
        al2.add(0,0);
        System.out.println(al2);

        System.out.println("-------------------");

    }
}
