package setAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        lesson4();
    }

    public static void lesson4() {
        System.out.println("Lesson 4");
        lesson4Task1();
        System.out.println();
        lesson4Task21();
        System.out.println();
        lesson4Task22();
        System.out.println();
        lesson4Task3();
        System.out.println();
        lesson4Task4();
        System.out.println();

    }

    public static void lesson4Task1() {
        System.out.println("\tLesson 4 - Task 1");
        TreeSet<String> taskList = new TreeSet<>();
        taskList.add("Покормить лошадь");
        taskList.add("Антону напомнить об отчете");
        taskList.add("Купить молоко");
        taskList.add("Выбросить мусор");

        for (String task : taskList) {
            System.out.println(task);
        }

    }

    public static void lesson4Task21() {
        System.out.println("\tLesson 4 - Task 2");
        TreeSet<Task> taskList = new TreeSet<>();
        taskList.add(new Task("Покормить лошадь"));
        taskList.add(new Task("Антону напомнить об отчете"));
        taskList.add(new Task("Купить молоко"));
        taskList.add(new Task("Выбросить мусор"));

        for (Task task : taskList) {
            System.out.println(task);
        }

    }

    public static void lesson4Task22() {
        System.out.println("\tLesson 4 - Task 2");
        TreeSet<Task> taskList = new TreeSet<>();
//        пришлось стувить паузы, т.к. добавлялось слишком быстро и выводился один  элемент
        try {
            taskList.add(new Task("Покормить лошадь"));
            Thread.sleep(100);
            taskList.add(new Task("Антону напомнить об отчете"));
            Thread.sleep(100);
            taskList.add(new Task("Купить молоко"));
            Thread.sleep(100);
            taskList.add(new Task("Выбросить мусор"));
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }

        for (Task task : taskList) {
            System.out.println(task);
        }
    }

    public static void lesson4Task3() {
        System.out.println("\tLesson 4 - Task 3");
        System.out.println("Если мы не хотим делать класс с implements Comparable");
        TreeSet<TaskNotComp> taskList = new TreeSet<>(new TaskComparator());
        try {
            taskList.add(new TaskNotComp("Покормить лошадь"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Антону напомнить об отчете"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Купить молоко"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Выбросить мусор"));
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }

        for (TaskNotComp task : taskList) {
            System.out.println(task);
        }

    }

    public static void lesson4Task4() {
        System.out.println("\tLesson 4 - Task 3");
        System.out.println("Если мы не хотим делать класс с implements Comparable");
        TreeSet<TaskNotComp> taskList = new TreeSet<>(new TaskComparator());
        try {
            taskList.add(new TaskNotComp("Покормить лошадь"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Антону напомнить об отчете"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Купить молоко"));
            Thread.sleep(100);
            taskList.add(new TaskNotComp("Выбросить мусор"));
        } catch (Exception e) {
            System.out.println("ERROR" + e.getMessage());
        }

        System.out.print("ceiling = " );
        System.out.println(taskList.ceiling(new TaskNotComp("Купить молоко")));
        System.out.print("ceiling (равный или ближайший больший объект или null если вообще нет похожих) = " );
        System.out.println(taskList.ceiling(new TaskNotComp("Купить мол")));
        System.out.println(taskList.ceiling(new TaskNotComp("мол")));
        System.out.print("floor = " );
        System.out.println(taskList.floor(new TaskNotComp("Купить молоко")));
        System.out.print("floor (равный или ближайший меньший объект или null если вообще нет похожих) = " );
        System.out.println(taskList.floor(new TaskNotComp("Купить мол")));
        System.out.println(taskList.ceiling(new TaskNotComp("мол")));
        System.out.println();
        System.out.println(taskList.contains(new TaskNotComp("Купить молоко")));
        System.out.println(taskList.contains(new TaskNotComp("Купить моло")));
        System.out.println();
        System.out.print("higher (ближайший больший объект или null если вообще нет похожих) = " );
        System.out.println(taskList.higher(new TaskNotComp("Купить молоко")));
        System.out.println();
        System.out.print("lower (ближайший меньший объект или null если вообще нет похожих) = " );
        System.out.println(taskList.lower(new TaskNotComp("Купить молоко")));
        System.out.println();

        for (TaskNotComp task : taskList) {
            System.out.println(task);
        }
        System.out.println();

        System.out.print("Самый первый элемент = ");
        System.out.println(taskList.first());
        System.out.print("Самый последний элемент = ");
        System.out.println(taskList.last());
        System.out.println();
        System.out.print("Самый первый элемент + удаление его из списка = ");
        System.out.println(taskList.pollFirst());
        System.out.print("Самый последний элемент + удаление его из списка = ");
        System.out.println(taskList.pollLast());
        System.out.println();

        for (TaskNotComp task : taskList) {
            System.out.println(task);
        }
        System.out.println();

        System.out.println("так же есть такие:");
        System.out.println("subSet - возвращает подмножество с А элемента до Б элемента");
        System.out.println("headSet - возвращает подмножество с начала до А элемента");
        System.out.println("tailSet - возвращает подмножество в А до конца списка");

    }

    public static void lesson3() {
        System.out.println("Lesson 3");
        lesson3Task1();
        System.out.println();
        lesson3Task2();
        System.out.println();
        lesson3Task3();
        System.out.println();
        lesson3Task4();
        System.out.println();

    }

    public static void lesson3Task1() {
        System.out.println("\tLesson 3 - Task 1");
        Task task = new Task("Купить лошадь");
        System.out.println(task.hashCode());

    }

    public static void lesson3Task2() {
        System.out.println("\tLesson 3 - Task 2");
        HashSet<Task> taskList = new HashSet<>();
        taskList.add(new Task("Купить молоко"));
        taskList.add(new Task("Купить лошадь"));
        taskList.add(new Task("Покормить кота"));
        taskList.add(new Task("Купить лошадь"));
        taskList.add(new Task("Купить молоко"));

        for (Task task : taskList) {
            System.out.println(task);
        }

    }

    public static void lesson3Task3() {
        System.out.println("\tLesson 3 - Task 3");
        HashSet<Task> taskList = new HashSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            Task task = new Task("Некая задача для нашего списка " + (int) (1000 * Math.random()));
            taskList.add(task);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(taskList.size());
        System.out.println(Task.getEqualsCount());
    }

    public static void lesson3Task4() {
        System.out.println("\tLesson 3 - Task 4");
        HashSet<Task> taskList = new HashSet<>();
        taskList.add(new Task("покормить лошадь"));
        System.out.println(taskList.contains(new Task("Покормить лошадь")));
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
