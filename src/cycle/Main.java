package cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task 1
        for (int i = 0; i < 5; i++) {
            System.out.println("YES");
        }
        System.out.println();

//        Task 2
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("After cycle");
        System.out.println(i);
        System.out.println();


//        Task 3
        for (int j = 15; j <= 40; j++) {
            System.out.println(j);
            if(j == 16) {
                System.out.println("Вы можете начать обучаться вождению");
            }
            if(j == 18) {
                System.out.println("Вы можете получить водительские права");
            }
            if(j == 35) {
                System.out.println("Вы можете баллотироваться на пост призедента");
            }
        }
        System.out.println();

//        Task 4
        for (i = 50; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

//        Task 5
//        четные
        for (i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

//        Task 5
//        не четные
        for (i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();


//        Task 6
        for (;;) {
            System.out.println("Введите первое число:");
            int value1 = new Scanner(System.in).nextInt();
            System.out.println("Введите второе число:");
            int value2 = new Scanner(System.in).nextInt();
            int result = value1 * value2;
            System.out.println("Произведение чисел равно: " + result);

        }
    }
}
