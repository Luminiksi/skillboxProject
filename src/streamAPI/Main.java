package streamAPI;

import myFeatures.Printer;
import myFeatures.Time;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        lesson2();
        lesson3();

    }

    public static void lesson3() {
        Printer.printLessonNumber(3);

        lesson3Task1();
        System.out.println();
        lesson3Task2();
        System.out.println();
        lesson3Task3();
        System.out.println();
        lesson3Task4();
        System.out.println();
        lesson3Task5();
        System.out.println();
        lesson3Task6();

    }

    public static void lesson3Task6() {
        Printer.printTaskNumber(6);
        Printer.printTaskName("Тестируем метод limit(3)");
        Stream.of(1, 2, 3, 4, 5)
                .limit(3)
                .forEach(System.out::println);

        Printer.printTaskName("Тестируем метод skip(3)");
        Stream.of(1, 2, 3, 4, 5)
                .skip(3)
                .forEach(System.out::println);
    }

    public static void lesson3Task5() {
        Printer.printTaskNumber(5);
        Printer.printTaskName("Тестируем метод peek() -  которывй используется для логирования");
        "abcdefg".chars()
                .peek(c -> System.out.println("char" + (char)c))
                .forEach(System.out::println);
        Printer.printDescription("Тестируем на строках, как будет/не будет изменятся объекты внутри стрима");
        Stream.of("тестим", "новый", "метод", "на", "качество")
                .peek(str -> System.out.println("String length = " + str.length()))
                .forEach(System.out::println);
    }

    public static void lesson3Task4() {
        Printer.printTaskNumber(4);
        Printer.printTaskName("Тестируем метод distinct() - который убирает повторения");
        Stream.of("skill", "box", "skill", "box")
                .distinct()
                .forEach(System.out::println);

        Printer.printTaskName("Тестируем метод sorted()");
        Stream.of("skillbox", "java", "art")
//                работает аналогично методу sort() класса Collections
//                то есть, классы, которые сортируются внутри стрима должны реализовывать интерфейс Comparable
                .sorted()
                .forEach(System.out::println);

        Printer.printDescription("С передачей компаратора -> sorted(Comparator.comparing(String::length))\nСОтрировка по длине");
        Stream.of("skillbox", "javacoding", "art")
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

    }

    public static void lesson3Task3() {
        Printer.printTaskNumber(3);
        Printer.printTaskName("Тестируем метод filter()");
        Printer.printDescription("Если мы пропишем множеству:\n\t.map(str -> str.split(\", \"))\n" +
                "\t.forEach(System.out::println);\nПолучим:");
        Stream.of("one, two, three",
                "four, five, six",
                "seven, eight, nine")
                .map(str -> str.split(", "))
                .forEach(System.out::println);
        Printer.printDescription("Теперь всё тоже самое, но вместо .map(str -> str.split(\", \"))\n" +
                "прописываем .flatMap(str -> Arrays.stream(str.split(\", \")))");
        Stream.of("one, two, three",
                        "four, five, six",
                        "seven, eight, nine")
                .flatMap(str -> Arrays.stream(str.split(", ")))
                .forEach(System.out::println);
    }

    public static void lesson3Task2() {
        Printer.printTaskNumber(2);
        Printer.printTaskName("Тестируем метод filter()");
        Printer.printDescription("Числа кратные 3 (все от 1 до 10)");

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                /*.filter(number -> {
                    *//* Первый варинат написания
                    if (number % 3 == 0) {
                        return true;
                    }
                    return false;*//*

                    *//*второй варинат написания
                    return number % 3 == 0;*//*
                })*/
//       третий варинат - самый короткий
        .filter(number -> number % 3 == 0)
                .forEach(System.out::println);
    }



    public static void lesson3Task1() {
        Printer.printTaskNumber(1);
        Printer.printTaskName("Тестируем map - умножение на 2 множества {1, 2, 3, 4, 5}");
        Time time = new Time();

        Printer.printDescription("Несколько стримов");
        time.setStart();
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream = stream.map(i -> i * 2);
        integerStream.forEach(System.out::println);
        time.setEnd();
        time.printTime();

        time.reset();
        Printer.printDescription("В одну строчку");
        time.setStart();
        Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * 2)
                .forEach(System.out::println);
        time.setEnd();
        time.printTime();

        time.reset();
        Printer.printDescription("Обычным методом (без стримов)");
        time.setStart();
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.println(array[i]);
        }
        time.setEnd();
        time.printTime();
    }

    public static void lesson2() {
        Printer.printLessonNumber(2);

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
        Printer.printDescription("Stream.generate(() -> Math.random()).limit(10)");
        stream2.forEach(System.out::println);
        Printer.printDescription("Stream.generate(Math::random).limit(10)");
        stream3.forEach(System.out::println);
        System.out.println();

//         Аналог обычного цикла
        Printer.printDescription("Классический цикл");
        for (int i = 0; i < 10; i++) {
            System.out.println(" i  = " + i);
        }
        Printer.printDescription("IntStream цикл");
        IntStream.range(0, 10).forEach(System.out::println);
    }
}
