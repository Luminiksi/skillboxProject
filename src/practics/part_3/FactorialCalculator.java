package practics.part_3;

import java.util.Scanner;

/**
 * Задание 1
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Введите факториал");
        int value = new Scanner(System.in).nextInt();
        int fact = 1;
        for (int i = 1; i <= value; i++) {
            fact *= i;
        }
        System.out.println("Значение факториала ранво " + fact);
    }
}
