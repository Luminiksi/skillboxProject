package myFeatures;

import static myFeatures.Colors.*;

public class Printer {
    public static String getStringLessonNumber(int number) {
        return "For lesson " + number;
    }

    public static String getStringTaskNumber(int number) {
        return "Task №" + number;
    }

    public static void printLessonNumber(int number) {
        System.out.println(ANSI_CYAN + "_________ " + getStringLessonNumber(number) + " _________" + ANSI_RESET);
    }

    public static void printTaskNumber(int number) {
        System.out.println(ANSI_YELLOW + "<----------- " + getStringTaskNumber(number) + " ----------->" + ANSI_RESET);
    }

    public static void printDescription(String description) {
        System.out.println(ANSI_PURPLE + "Description : \n" + description + ANSI_RESET);
    }

    public static void printTaskName(String taskName) {
        System.out.println(ANSI_GREEN + taskName + ANSI_RESET);
    }

    public static void printTime(long time) {
        System.out.println(ANSI_BLUE + "Время выполнения: " + time + " нс (или в мс: " + time / 1000000 + ")" + ANSI_RESET);
    }
}
