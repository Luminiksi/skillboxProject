package prictice;

import java.util.Scanner;

public class Main {
    public static final String WRONG_STRING = "Была введенеа не корректная строка";
    public static void main(String[] args) {
        thirdExperiment();
    }

    public static void thirdExperiment() {
        String string = new Scanner(System.in).nextLine();
        System.out.println(thirdExperiment(string));

    }

    public static String thirdExperiment(String string){
        String result = "";
        int firstIndex = string.indexOf(" ");
        if (firstIndex < 0 || string.length() <= firstIndex + 2){
            return WRONG_STRING;
        }
        int secondIndex = string.indexOf(" ", firstIndex + 1);
        if (secondIndex < 0 || string.length() <= secondIndex + 1) {
            return WRONG_STRING;
        }
        String lastName = string.substring(0, firstIndex);
        result += "Фамилия: " + lastName + "\n";
        String firstName = string.substring(firstIndex + 1, secondIndex);
        result += "Имя: " + firstName + "\n";
        String middleName = string.substring(secondIndex + 1);
        result += "Отчество: " + middleName;
        return result;
    }

    public static void secondExperiment() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое чило, потом на другой строке знак, а на третьей второе число:");
            String first = scanner.nextLine();
            String operation = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(secondExperiment(first.trim(), operation.trim(), second.trim()));
        }
    }

    public static String secondExperiment(String first, String operation, String second) {
        int a = getInteger(first, "Первое");
        int b = getInteger(second, "Второе");
        if (operation.isBlank()) {
            System.out.println("Вы не задали операцию, считаем что это сложение (+)");
            operation = "+";
        }

        return switch (operation) {
            case "+" -> a + " + " + b + " = " + (a + b);
            case "-" -> a + " - " + b + " = " + (a - b);
            case "*" -> a + " * " + b + " = " + (a * b);
            case "/" -> a + " / " + b + " = " + (a / b);
            default ->  "Вы ввели не понятную операцию";
        };
    }

    public static void firstExperiment() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первую строку: ");
            String first = scanner.next();
            System.out.println("Введите вторую строку: ");
            String second = scanner.next();
            System.out.println(firstExperiment(first, second));
        }
    }

    public static String firstExperiment(String first, String second) {
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

    public static int getInteger(String number, String position) {
        try {
            if (number.isBlank()) {
                System.out.println(position + " число пустое, считаем его за 0");
                return 0;
            }
            int num = Integer.parseInt(number);
            return num;
        } catch (Exception e) {
            System.out.println(position + " число - не является числом, считаем его за 0");
            return 0;
        }
    }
}
