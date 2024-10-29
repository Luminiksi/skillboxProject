package exceptions;

import myFeatures.Printer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson4 {
    public static void run() {
        Printer.printLessonNumber(1);
        /*task1();
        System.out.println();
        task2();
        System.out.println();*/
        task3();
    }

    public static void task1() {
        Printer.printTaskNumber(1);
        BufferedReader reader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("file.txt");
            reader = new BufferedReader(fileReader);
            String data = reader.readLine();
            doSomthing(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            System.out.println("I/O exception occurent :(");
        } finally {
            try {
                reader.close();
                fileReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close resource!");
            }
        }

    }

    public static void task2() {
        Printer.printTaskNumber(2);

        try(FileReader fileReader = new FileReader("file.txt");
            BufferedReader reader = new BufferedReader(fileReader)) {
            String data = reader.readLine();
            doSomthing(data);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        } catch (IOException e) {
            System.out.println("I/O exception occurent :(");
        }

    }

    private static void doSomthing(String data) {
        System.out.println("Do something with data");
    }

    public static void task3() {
        Printer.printTaskNumber(3);
        try {
            try(MyResource resource = new MyResource()) {
                doSomthing2();
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);
            for(Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed exception: " + t);
            }
        }
    }

    private static void doSomthing2() {
        int[] array = null;
        array[3] = 1;
    }
}
