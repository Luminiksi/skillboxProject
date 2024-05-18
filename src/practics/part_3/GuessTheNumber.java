package practics.part_3;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 4
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            }
            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
