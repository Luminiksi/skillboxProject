package prictice;

import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первую строку: ");
            String first = scanner.next();
            System.out.println("Введите вторую строку: ");
            String second = scanner.next();
            System.out.println(theExperiment(first, second));
        }
    }

    public static String theExperiment(String first, String second) {
        if (first.isBlank()) {
            return "Не получится сравнить - первая строка пустая";
        }
        if (second.isBlank()) {
            return "Не получится сравнить - вторая строка пустая";
        }
        boolean isEquals = first.equals(second);
        if (isEquals) {
            return first + " == " + second;
        }
        return first + " != " + second;
    }
}
