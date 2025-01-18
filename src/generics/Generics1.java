package generics;

import java.util.ArrayList;

public class Generics1 {
    public static void main(String[] args) {

        // Type safety
        String str[] = new String[5];
        str[0] = "name1";
        str[1] = "name2";
        str[2] = "PW";
//        str[3] = 10; // Compile time error

        // No Type Safety, can add any type data heterogenous
        ArrayList arrayList = new ArrayList();
        arrayList.add("name1");
        arrayList.add("name2");

        arrayList.add(10);

        String name1 = (String) arrayList.get(0); // type casting
        String name2 = (String) arrayList.get(1);
        String name3 = (String) arrayList.get(2); // ClassCastException class java.lang.Integer cannot be cast to class java.lang.String

        // Type safety using generics
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("name1");
        arrayList1.add("name2");
//        arrayList1.add(10);

        String str1 = arrayList1.get(0); // no need to typecast here as it's string object using generics
        String str2 = arrayList1.get(1);
    }
}
