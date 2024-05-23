package strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        lesson4();
    }

    public static void lesson4() {
        System.out.println(ANSI_GREEN + "Перебор символов в строке:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 1:" + ANSI_RESET);
        String hello = "Hello";
        System.out.println("String = " + hello);
        char[] chars = hello.toCharArray();
        System.out.println("Первая буква: " + chars[0]);
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 2:" + ANSI_RESET);
        String str = "Это тестовая строка для подсчета пробелов";
        System.out.println("String = " + str);
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);
        System.out.println();

        System.out.println(ANSI_GREEN + "Работа с пробелами по краям строки:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 3:" + ANSI_RESET);
        String text = "  Some spaces at the start and at the end   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .trim()...");
        String clearedText = text.trim();
        System.out.println("Полученный текст :{" + clearedText + "}");
        text = "  Some spaces at the \nstart and at the \tend   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .trim()...");
        clearedText = text.trim();
        System.out.println("Полученный текст :{" + clearedText + "}");
        text = "  Some spaces at the \nstart and at the \tend   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .strip()...");
        clearedText = text.strip();
        System.out.println("Полученный текст :{" + clearedText + "}");
        System.out.println(ANSI_RED + "!Как получить пробел другой кодировки - пока хз..." + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_GREEN + "Методы isDigit и isLetter:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 4:" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Проверяем, является ли символ числом:" + ANSI_RESET);
        text = "1990 year";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Проверяем первый символ: ");
        if(Character.isDigit(text.charAt(0))) {
            System.out.println("This is digit");
        } else {
            System.out.println("This is not digit");
        }
        System.out.println("Проверяем 7 символ буква ли он: ");
        if(Character.isLetter(text.charAt(6))) {
            System.out.println("This is letter");
        } else {
            System.out.println("This is not letter");
        }
        System.out.println("Проверяем 7 символ иероглиф ли он: ");
        if(Character.isIdeographic(text.charAt(6))) {
            System.out.println("This is ideographic");
        } else {
            System.out.println("This is not ideographic");
        }
        System.out.println("Проверяем первый символ - является ли переданный символ допустимым при именовании переменных и методов в Java: ");
        if(Character.isJavaLetterOrDigit(text.charAt(0))) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Кодировки в Java:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 5:" + ANSI_RESET);
        System.out.print("Узнаем дефолтную кодировку через java.nio.charset.Charset: " );
        System.out.println(Charset.defaultCharset());
        System.out.println(ANSI_BLUE + "Также класс Charset используется для задания кодировки текста. " +
                "Чтобы узнать коды символов в данной кодировке, используем метод getBytes класса String:" + ANSI_RESET);
        text = "Привет";
        System.out.println("Кодировка: " + StandardCharsets.UTF_8);
        byte[] textBytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte textByte: textBytes) {
            System.out.print(textByte + " ");
        }
        System.out.println();
        System.out.println("Кодировка: Windows-1251");
        try {
            textBytes = text.getBytes("Windows-1251");
            for (byte textByte: textBytes) {
                System.out.print(textByte + " ");
            }
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.println(ANSI_RED + "Упс... Ошибочка" + ANSI_RESET);
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Как сменить кодировку текста:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 6:" + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_GREEN + "Методы isDigit и isLetter:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 7:" + ANSI_RESET);
        String newText = "Hello всем!";
        System.out.println("Исходная строчка: {" + newText + "}");
        String encoded = new String(newText.getBytes(), StandardCharsets.US_ASCII);
        System.out.println("Полученная строчка: {" + encoded + "}");
        System.out.println();
    }

    public static void lesson3() {
        int age = 37;
        String name = "Анна";
        String personInfo = name + " - " + age + " лет";
        String value = Integer.toString(age);

        Double weight = 3.45;
        double weig = 3.45;
        value = weight.toString();
        value = Double.toString(weig);
        value = String.valueOf(weig);

        value = "234524";
        int count = Integer.parseInt(value);
        System.out.println(count);
        try {
            value = "234524234234243";
            count = Integer.parseInt(value);
            System.out.println(count);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void lesson2() {
        String name = "Анастасия";
        String surname = "Басова";
        LocalDate birthday = LocalDate.of(1994, 1, 31);

        String personInfo = name + " " + surname + " - " + birthday;
        System.out.println(personInfo);
    }
}
