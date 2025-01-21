package important_apis_and_annotations;

import arrays.Arrays;

import java.util.*;
import java.util.function.Consumer;


public class InbuiltForEachMethod {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(132);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(18);

        System.out.println(arrayList);

        // Consumer interface without lambda expression
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        // Consumer interface with lambda expression
        Consumer<Integer> consumer1 = System.out::println;


        arrayList.forEach(System.out::println);

    }
}
