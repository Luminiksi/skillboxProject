package streamAPI.lessons;

import myFeatures.Printer;
import streamAPI.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(4);
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
    }

    public static void task5() {
        Printer.printTaskNumber(5);
        Printer.printTaskName("Проверяем список [1, 2, 3, 4, 5] на различные условия с помощью методов anyMatch / noneMatch / allMatch");
        Printer.printDescription("Проверяем anyMatch() - если есть хотябы одно совпадение - возвращает true");
        boolean hasMoreThan10 = Stream.of(1, 2, 3, 4, 5).anyMatch(i -> i > 10);
        System.out.println(hasMoreThan10);
        Printer.printDescription("А теперь в тот список добавим 11");
        hasMoreThan10 = Stream.of(1, 2, 3, 4, 5, 11).anyMatch(i -> i > 10);
        System.out.println(hasMoreThan10);

        Printer.printDescription("Проверяем noneMatch() - если ни один элемент не соответвует данному условию");
        boolean hasMoreThan10_2 = Stream.of(1, 2, 3, 4, 5).noneMatch(i -> i > 10);
        System.out.println(hasMoreThan10_2);
        Printer.printDescription("А теперь в тот список добавим 11");
        hasMoreThan10_2 = Stream.of(1, 2, 3, 4, 5, 11).noneMatch(i -> i > 10);
        System.out.println(hasMoreThan10_2);

        Printer.printDescription("Проверяем allMatch() - все элементы соотвествуют данному условию");
        boolean hasMoreThan10_3 = Stream.of(1, 2, 3, 4, 5).allMatch(i -> i > 10);
        System.out.println(hasMoreThan10_3);
        Printer.printDescription("А теперь сделаем условие > 0");
        hasMoreThan10_3 = Stream.of(1, 2, 3, 4, 5).allMatch(i -> i > 0);
        System.out.println(hasMoreThan10_3);
    }

    public static void task4() {
        Printer.printTaskNumber(4);
        Map<String, Person> map = Stream.of(
                new Person("1"), new Person("2"), new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person));
        map.forEach((s, person) -> System.out.println(s + " = " + person));

        Printer.printDescription("А теперь посморим, что будет, если мы добавим 2 одинаковых элемента и дополним условие");
        Map<String, Person> mapTwo = Stream.of(
                new Person("1"), new Person("1"), new Person("3")
        ).collect(Collectors.toMap(Person::getPhone, person -> person, (existing, current) -> existing));
        mapTwo.forEach((s, person) -> System.out.println(s + " = " + person));


        Printer.printDescription("А теперь попробуем использовать группировку:");
        Map<Integer, List<Person>> personMap = Stream.of(
                new Person("1"),
                new Person("2"),
                new Person("3"),
                new Person("4"),
                new Person("24"),
                new Person("33"),
                new Person("345"),
                new Person("2874")
//        ).collect(Collectors.toMap(Person::getPhone, person -> person), (existing, current) -> existing);
        ).collect(Collectors.groupingBy(p -> p.getPhone().length()));
        personMap.forEach((integer, people) -> System.out.println(integer + " - " + people));

        Printer.printDescription("Ещё одна групировка списка: [\"a\", \"a\", \"b\", \"c\", \"d\", \"e\", \"c\", \"f\", \"g\", \"a\", \"h\", \"f\"]");
        Map<String, Long> mapThree = Stream.of(
                        "a", "a", "b", "c", "d", "e", "c", "f", "g", "a", "h", "f"
                )
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapThree);
    }

    public static void task3() {
        Printer.printTaskNumber(3);
        Printer.printTaskName("Использование метода collect(Collectors.toList())");
        List<Integer> collection = Stream.of(10, 100, 5, 100)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        collection.forEach(System.out::println);
    }

    public static void task2() {
        Printer.printTaskNumber(2);
        Printer.printTaskName("Работа с min() / max()");
        Optional<String> shortest = Stream.of("skill", "box", "skill", "box")
                .min(Comparator.comparing(String::length));
        System.out.println("Shortest = " + shortest);
        Optional<String> maxLength = Stream.of("skill", "box", "skill", "box")
                .max(Comparator.comparing(String::length));
        System.out.println("Max length = " + maxLength);
        Printer.printDescription("Пробуем на пустом:");
        maxLength = Stream.of("skill", "box", "skill", "box")
                .filter(str -> str.equals("abc"))
                .max(Comparator.comparing(String::length));
        System.out.println("Max length = " + maxLength);
    }

    public static void task1() {
        Printer.printTaskNumber(1);
        Printer.printDescription("Выведем все элементы с помощью forEach(x -> System.out.println(\"-> \" + x))\n" +
                "Но перед этим применим метод distinct()");
        Stream.of("skill", "box", "skill", "box")
                .distinct()
                .forEach(x -> System.out.println("-> " + x));

        Printer.printDescription("А теперь выведем количество множества (такого же, с тем же distinct()), при помощи метода count()");
        long count = Stream.of("skill", "box", "skill", "box")
                .distinct()
                .count();
        System.out.println(count);
    }
}
