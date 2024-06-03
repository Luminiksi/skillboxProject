package setAndMap;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        lesson2();
    }

    public static void lesson2() {
        System.out.println("Lesson 2");
        lesson2Task1();
        System.out.println();
        lesson2Task2();
        System.out.println();
        lesson2Task3();
        System.out.println();
    }

    public static void lesson2Task1() {
        System.out.println("\tLesson 2 - Task 1");

        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        todoList.add("Купить лошадь");
        todoList.add("Купить молоко");

        for (String item :
                todoList) {
            System.out.println(item);
        }

        System.out.println();
    }

    public static void lesson2Task2() {
        System.out.println("\tLesson 2 - Task 2");

        HashSet<String> todoList = new HashSet<>();
        todoList.add("Купить молоко");
        todoList.add("Купить лошадь");
        todoList.add("Покормить кота");
        boolean horseAgain = todoList.add("Купить лошадь");
        System.out.println(horseAgain);
        todoList.add("Купить молоко");
        System.out.println();

        System.out.println(todoList.contains("Купить молоко"));

        for (String item :
                todoList) {
            System.out.println(item);
        }
        System.out.println();

        System.out.println("REMOVE");
        System.out.println(todoList.remove("Купить лошадь"));

        for (String item :
                todoList) {
            System.out.println(item);
        }
        System.out.println();

        todoList.clear();
        System.out.println("Clear");
        System.out.println(todoList.isEmpty());

        for (String item :
                todoList) {
            System.out.println(item);
        }

        System.out.println();
    }
    public static void lesson2Task3() {
        System.out.println("\tLesson 2 - Task 3");

        ArrayList<Task> todoList = new ArrayList<>();
        todoList.add(new Task("Купить молоко"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Покормить кота"));
        todoList.add(new Task("Купить лошадь"));
        todoList.add(new Task("Купить молоко"));

        for (Task item :
                todoList) {
            System.out.println(item);
        }

        System.out.println();
    }

}
