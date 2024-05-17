package cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/**
 *  урок по while / do while
 */
        System.out.println("Практика по while / do while");
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1 - бесконечный цикл while");
        while (true) {
            System.out.println("hello");
        }
    }

    public static void task2() {
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
        System.out.println("Задание 3 - подсчет суммы (for)");
        int sum = 0;

        for (int value = -1; value != 0;) {
            value = new Scanner(System.in).nextInt();
            sum += value;
        }

        System.out.println("Сумма введеных чисел равна " + sum);
        System.out.println();
    }
}
