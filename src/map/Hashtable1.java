package map;

import java.util.Hashtable;

public class Hashtable1 {
    public static void main(String[] args) {
        Hashtable ht =  new Hashtable();
        ht.put(1, "Rohit");
        ht.put(2, "Virat");
        ht.put(3,"Rohan");

        System.out.println(ht);
        ht.putIfAbsent(2, "Rohan");
    }
}
