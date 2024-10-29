package exceptions.lessons;

import myFeatures.Printer;

public class Lesson6 {
    public static void run() {
        Printer.printLessonNumber(6);
        task1();
        System.out.println();
    }

    public static void task1() {
        Printer.printTaskNumber(1);

        int[] intArray = {1, 2, 3, 4, 5};
        int sum = calculateSum(intArray);
        System.out.println(sum);

    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
