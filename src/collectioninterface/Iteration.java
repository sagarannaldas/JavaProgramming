package collectioninterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(50);
        al.add(90);

        System.out.println(al);

        // for loop
        for(int i=0; i<al.size(); i++) {
            Object o = al.get(i);
            System.out.println(o);
        }

        // for each// Enhanced loop
        for(Object o: al) {
            System.out.println(o);
        }

        Iterator itr = al.iterator();

        while(itr.hasNext()) {
//            Integer i = (Integer) itr.next();
            System.out.println(itr.next());
        }

        ListIterator lItr = al.listIterator(al.size());

        while(lItr.hasPrevious()) {
            System.out.println(lItr.previous());
        }
    }
}
