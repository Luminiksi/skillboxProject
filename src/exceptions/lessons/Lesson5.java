package exceptions.lessons;

import myFeatures.Printer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson5 {
    public static void run() {
        Printer.printLessonNumber(5);
        try {
            task1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        try {
            task2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void task1() throws MyCustomException {
        Printer.printTaskNumber(1);
        throw new MyCustomException("");
    }

    public static void task2() throws IOException {
        readLineFromFile("");
    }

    public static String readLineFromFile(String fileName) throws IOException {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader reader = new BufferedReader(fileReader)) {
            return reader.readLine();
        } catch (FileNotFoundException e) {
            if (!isFileNameValid(fileName)) {
                throw new IncorrectFileException("File name " + fileName + " is not valid");
            }
            throw e;
        }
    }

    public static boolean isFileNameValid(String fileName) {
//        тут логика проверки
        return false;
    }
}
