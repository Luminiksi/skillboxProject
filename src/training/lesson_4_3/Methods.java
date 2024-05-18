package training.lesson_4_3;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.print("Введите число и нажмите <Enter>: ");
        double value = new Scanner(System.in).nextDouble();
        square(value);
    }

    public static void square(double value) {
        System.out.println(value *  value);
    }
}
