package important_apis_and_annotations;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 9, 7, 4, 2, 6);

        // We can consume stream only one time
        Stream<Integer> streamList = list.stream();

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

//        streamList.forEach(consumer);

//        streamList.forEach(consumer); // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0)
                    return true;
                else
                    return false;

            }
        };

        Stream<Integer> evenStream = streamList.filter(integerPredicate);

        Stream<Integer> sortedStream = evenStream.sorted();

        Function<Integer, Integer> integerFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        Stream<Integer> stream1 = sortedStream.map(integerFunction);

        stream1.forEach(consumer);

//    If return type is same, then we can do chaining like given below

//        Stream<Integer> finalStream = streamList.
//                filter(n -> n % 2 == 0).
//                sorted().
//                map(n -> n * 2);


    }
}
