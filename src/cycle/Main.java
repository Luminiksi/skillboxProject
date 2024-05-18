package cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task10();
    }

    public static void task1() {
        System.out.println("Урок 3.3 по while / do while");
        System.out.println("Задание 1 - бесконечный цикл while");
        while (true) {
            System.out.println("hello");
        }
    }

    public static void task2() {
        System.out.println("Урок 3.3 по while / do while");
        System.out.println("Задание 2 - подсчет суммы");
        int sum = 0;
        int value = -1;

        while (value != 0) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }

        System.out.println("Сумма введеных чисел равна " + sum);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Урок 3.3 по while / do while");
        System.out.println("Задание 3 - подсчет суммы (for)");
        int sum = 0;

        for (int value = -1; value != 0;) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }

        System.out.println("Сумма введеных чисел равна " + sum);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Урок 3.4 - Операторы “break” и “continue”");
        System.out.println("Задание 1 - ищем конкретный год из списка");

        int soughtYear = 1985;

        int firstYear = 1922;
        int lastYear = 2024;

        boolean yearExists = false;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year == soughtYear) {
                yearExists = true;
                break;
            }
        }

        String found = "Год найден";
        String notFound = "Год не найден";
        System.out.println(yearExists ? found : notFound);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Урок 3.4 - Операторы “break” и “continue”");
        System.out.println("Задание 2 - весокосные года");

        int firstYear = 1922;
        int lastYear = 2024;

        for (int year = firstYear; year <= lastYear; year++) {
            if (year % 4 != 0) {
                continue;
            }
            System.out.println(year);
            for (int month = 0; month <= 12; month++) {
                String zero = month < 10 ? "0" : "";
                System.out.println("    29." + zero + month + "." + year);
            }
        }
        System.out.println();
    }

    public static void task6() {
        System.out.println("Урок 3.5 - Оператор “switch … case”");
        System.out.println("Задание 1.1 - как бы выглядел код без “switch … case”");

        while (true) {
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("Привет!")) {
                System.out.println("Привет!");
            } else if (input.equals("как дела?")) {
                System.out.println("Отлично! У тебя как?");
            } else {
                System.out.println("не понимаю сообщения :(");
            }
        }
    }

    public static void task7() {
        System.out.println("Урок 3.5 - Оператор “switch … case”");
        System.out.println("Задание 1.2 - а теперь с “switch … case”");

        while (true) {
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine();


            switch (input) {
                case "Привет!":
                    System.out.println("Привет!");
                    break;
                case "Как дела?" :
                    System.out.println("Отлично! У тебя как?");
                    break;
                default:
                    System.out.println("не понимаю сообщения :(");
            }
        }
    }

    public static void task8() {
        System.out.println("Урок 3.5 - Оператор “switch … case”");
        System.out.println("Задание 1.3 - сокращаем(данный синтаксиси пошел с 14 версии java)");

        while (true) {
            System.out.println("Введите сообщение");
            String input = new Scanner(System.in).nextLine();

            switch (input) {
                case "Привет!" -> System.out.println("Привет!");
                case "Как дела?" -> {
                    System.out.println("Отлично!");
                    System.out.println("У тебя как?");
                }
                default -> System.out.println("не понимаю сообщения :(");
            }
        }
    }

    public static void task9() {
        System.out.println("Урок 3.6 - Оператор switch в Java 17");
        System.out.println("Задание 1 - старый синтаксис(до 17 версии): только обрабатывал данные и не возвращал значение");
        System.out.println();

        System.out.println("Код с условиями:");
        System.out.println(formatString(123124.324));
        System.out.println("Код с switch:");
        System.out.println(formatterPatternSwitch(123124.324));

        System.out.println("В новом не нужно использовать break");
    }

    public static String formatString(Object obj) {
        String result = "";
        if (obj instanceof Integer) {
            result = String.format("int %d", (Integer)obj);
        } else if (obj instanceof Long) {
            result = String.format("long %d", (Long)obj);
        } else if (obj instanceof Double) {
            result = String.format("double %f", (Double)obj);
        } else if (obj instanceof String) {
            result = String.format("string %s", obj);
        }
        return result;
    }

    public static String formatterPatternSwitch(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("string %s", s);
            default -> o.toString();
        };
    }

    public static void task10() {
        System.out.println("Урок 3.6 - Оператор switch в Java 17");
        System.out.println("Задание 2 - Проверки");
        System.out.println();

        System.out.println("Можно задействовать проверку на null");

        Object o = null;

        switch (o) {
            case null -> System.out.println("Is NULL");
            case String s -> System.out.println("String");
            default -> System.out.println("Something else");
        }
        System.out.println();

//        TODO: проверить ка кэто должно работать и есть ли оно в других версиях(кроме как на 17ой)
        /*дополнительное условие должно рабоатть на 17+, но у меня на 21ой почему-то не пашет, надо будет почитать*/
        /*String value = "test string";
        switch (value) {
            case String s && (s.length() < 3) -> System.out.println("Строка слишком короткая");
            case String s && (s.length() < 10) -> System.out.println("Нормальная строка");
            default -> System.out.println("Слишком длинная строка");
        }*/

    }
}

