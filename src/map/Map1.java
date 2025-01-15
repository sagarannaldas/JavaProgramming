package map;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(null,null);
        hm.put(01, "Virat");
        hm.put(02, "Rohit");
        hm.put(03, "Rohan");
        System.out.println(hm);

        HashMap hm1 = new HashMap();
        hm1.put("kohli", "Virat");
        hm1.put("hyd", "sagar");
        hm1.put("mumbai", "laptop");
        System.out.println(hm1);

        LinkedHashMap lhmp = new LinkedHashMap();
        lhmp.put("kohli", "Virat");
        lhmp.put("hyd", "sagar");
        lhmp.put("mumbai", "laptop");
        System.out.println(lhmp);
    }
}
