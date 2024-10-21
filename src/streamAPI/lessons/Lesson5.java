package streamAPI.lessons;

import myFeatures.Printer;
import streamAPI.Employee;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5);
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

    public static void task1() {
        Printer.printTaskNumber(1);
        Printer.printTaskName("Выполнение  не параллельного стрима и параллельного стрима " +
                "на списке из 100_000 строк");

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            strings.add(Double.toHexString(Math.random()));
        }

        long start = System.currentTimeMillis();
        long count = strings.stream().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);

        start = System.currentTimeMillis();
        count = strings.stream().parallel().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);
    }

    public static void task2() {
        Printer.printTaskNumber(2);
        Printer.printTaskName("Выполнение  не параллельного стрима и параллельного стрима " +
                "на списке из 30 строк (почему не 10 - потому что комп мощный и много ядер....)");

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            strings.add(Double.toHexString(Math.random()));
        }

        long start = System.currentTimeMillis();
        long count = strings.stream().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Sequential: " + duration);

        start = System.currentTimeMillis();
        count = strings.stream().parallel().filter(s -> {
            String text = "";
            for (int i = 0; i < 50; i++) {
                text += s;
            }
            return text.contains("abcd");
        }).count();
        duration = System.currentTimeMillis() - start;
        System.out.println("Parallel: " + duration);
    }

    public static void task3() {
        Printer.printTaskNumber(3);
        Printer.printTaskName("Тестируем reduce()");
        int[] numbers = {4, 5, 6};
//        Arrays.stream(numbers).reduce(0, Integer::sum);
//        Arrays.stream(numbers).reduce(0, (a, b) -> {return a + b;});
        int result = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }

    public static void task4() {
        Printer.printTaskNumber(4);
        Printer.printTaskName("Методы, которые могут заменить reduce()");
        int[] numbers = {4, 5, 6, 3, 5, 9};
        Printer.printDescription("Рассмотрим все примеры на массиве чисел: " + numbers.toString());

        int res1 = Arrays.stream(numbers).sum();
        Printer.printResult("Результат метода суммирования эллементов .sum()", Integer.toString(res1));

        double res2 = Arrays.stream(numbers).average().orElse(0.0);
        Printer.printResult("Результат метода суммирования эллементов .average().orElse(0.0)", Double.toString(res2));

        int res3 = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        Printer.printResult("Результат метода суммирования эллементов .max().orElse(Integer.MIN_VALUE)", Integer.toString(res3));
        int res4 = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        Printer.printResult("Результат метода суммирования эллементов .min().orElse(Integer.MAX_VALUE)", Integer.toString(res4));

        IntSummaryStatistics statistics = Arrays.stream(numbers).summaryStatistics();
        Printer.printResult("Результат метода суммирования эллементов .summaryStatistics()", statistics.toString());
    }

    public static void task5() {
        Printer.printTaskNumber(5);
        Printer.printTaskName("Практический пример");
        Stream<Employee> employess = getEmployeeStream();

        int summ = employess
                .filter(e -> e.getHiringDate().isBefore(LocalDate.now().minusYears(3)))
                .map(Employee::getSavary)  // преобразуем стрим в стрим из зарплат оставшихся работников
                .reduce(0, Integer::sum);
        Printer.printResult("ЗП после фильра", Integer.toString(summ));

        Optional<Employee> max = getEmployeeStream()
                .filter(e -> e.getHiringDate().isBefore(LocalDate.now().minusYears(3)))
                .max(Comparator.comparing(Employee::getSavary));
        Printer.printResult("Сотрудник с самой большой ЗП (точнее его ЗП)", Integer.toString(max.get().getSavary()));
    }

    private static Stream<Employee> getEmployeeStream() {
        Employee[] employeesArray = {
                new Employee(100_000, LocalDate.of(2020, 12, 10)),
                new Employee(120_000, LocalDate.of(2022, 10, 4)),
                new Employee(80_000, LocalDate.of(2019, 1, 30)),
                new Employee(205_000, LocalDate.of(2018, 7, 17)),
                new Employee(95_000, LocalDate.of(2020, 8, 26)),
                new Employee(170_000, LocalDate.of(2023, 10, 14)),
                new Employee(145_000, LocalDate.of(2020, 9, 3)),
                new Employee(112_000, LocalDate.of(2020, 5, 1))
        };

        Stream<Employee> employess = Stream.of(employeesArray);
        return employess;
    }
}
