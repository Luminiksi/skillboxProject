package cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Task 7
        int i = 0;
        for (; i < 100; i = i + 3) {
            System.out.println(i);
        }
//        Task 8 (бесконечный цикл)
        /*for (int j = 0; ; j = j + 3) {
            System.out.println(j);
        }*/

//        Task 9 (бесконечный цикл)
        /*for (int j = 0; j < 100;) {
            System.out.println(j);
        }*/

//        Task 9 (четные числа)
        for (int j = 0; j < 100;) {
            System.out.println(j);
            j = j +2;
        }

    }
}
