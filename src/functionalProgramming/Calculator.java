package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Calculator {
    public static void main(String[] args) {
        lesson3();
        System.out.println();
        System.out.println();
        lesson4();
    }

    public static void lesson4() {
        System.out.println("From lesson 4");

        System.out.println("BiFunction with lambda");
        int a= 5;
        int b = 3;

        int result2 = calculate(a, b, (BiFunction<Integer, Integer, Integer>) (a1, b1) -> a1 + b1);
        System.out.println(result2);
        System.out.println();

        System.out.println("List with lambda");
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        integers.forEach(item -> System.out.println(item));
        System.out.println();

        System.out.println("List with lambda 2");
        integers.forEach(System.out::println);
        System.out.println();

        System.out.println("Consumer with lambda");
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello");
        System.out.println();

        System.out.println("Consumer with  2");
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello 2");
        System.out.println();

        System.out.println("Consumer with  3");
        Consumer<String> consumer3 = Calculator::print;
        consumer3.accept("Hello 3");
        System.out.println();

        System.out.println("Supplier with lambda");
        Supplier<String> supplier = String::new;
        System.out.println(supplier.get());
        System.out.println();

    }

    public static void lesson3() {
        System.out.println("From lesson 3");

        System.out.println("Test calculate:");
        int a= 5;
        int b = 3;
        /*Action<Integer> action = new ActionSum();
        int result = calculate(a, b, action);*/
        int result = calculate(a, b, new Action<Integer>() {
            //анонимный класс
            @Override
            public Integer calculate(Integer t1, Integer t2) {
                return t1 + t2;
            }
        });
        System.out.println(result);
        System.out.println();

        System.out.println("Test Supplier:");
        var supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "HI!";
            }
        };
        System.out.println(supplier.get());
        System.out.println();

        System.out.println("Test Consumer:");
        var consumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println("<b>" + s + "</b>");
            }
        };
        consumer.accept("SkillboxProject");
        System.out.println();

        System.out.println("Test Predicate:");
        var isEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };
        System.out.println(isEven.test(8) + " | " + isEven.test(9));
        System.out.println();

        System.out.println("Test BiFunction:");
        int result2 = calculate(a, b, new BiFunction<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        });
        System.out.println(result2);
        System.out.println();
    }

    private static void print(String str) {
        System.out.println(str);
    }

    private static int calculate(int a, int b, Action<Integer> action) {
        return action.calculate(a, b);
    }

    private static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> action) {
        return action.apply(a, b);
    }
}
