package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamEmpty = Stream.empty();
        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        List<Double> doubleList = List.of(1d, 2d, 3d, 4d);
        Stream<Double> streamOfDouble = doubleList.stream();

        double[] array = {1.2, 3.6, 7.9};
        DoubleStream stream = Arrays.stream(array);

//        Тут создаются бесконечные стримы
        /*Stream<Double> stream2 = Stream.generate(() -> Math.random());
        Stream<Double> stream3 = Stream.generate(Math::random);*/
        Stream<Double> stream2 = Stream.generate(() -> Math.random()).limit(10);
        Stream<Double> stream3 = Stream.generate(Math::random).limit(10);
        System.out.println("Stream.generate(() -> Math.random()).limit(10)");
        stream2.forEach(System.out::println);
        System.out.println("Stream.generate(Math::random).limit(10)");
        stream3.forEach(System.out::println);
        System.out.println();

//         Аналог обычного цикла
        System.out.println("Классический цикл");
        for (int i = 0; i < 10; i++) {
            System.out.println(" i  = " + i);
        }
        System.out.println("IntStream цикл");
        IntStream.range(0, 10).forEach(System.out::println);
    }
}
