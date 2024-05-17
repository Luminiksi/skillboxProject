package cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task5();
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
}
