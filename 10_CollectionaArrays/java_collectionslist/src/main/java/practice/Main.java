package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String string = scanner.nextLine();
            if(string.equals("LIST")) {
                printList();
                continue;
            }
            if (string.equals("INFO")) {
                printInfo();
                continue;
            }
            Command command = parsCommand(string);
            switch (command.getCommand()) {
                case "ADD" -> addToList(command.getTodo());
                case "EDIT" -> editList(command.getTodo());
                case "DELETE" -> deleteFromList(command.getTodo());
                default -> System.out.println("Команда не распознана...");
            }
        }
    }

    public static void printList() {
        int index = 0;
        for (String todo : todoList.getTodos()) {
            System.out.println(index + " - " + todo);
            index++;
        }
    }

    public static void addToList(String string) {
        todoList.add(string);
        System.out.println("Добавлено дело \"" + string + "\"");
    }

    public static void editList(String string) {
        Command command = parsCommand(string);
        int index = Integer.parseInt(command.getCommand());
        if (index + 1 >= todoList.getTodos().size()) {
            todoList.edit(index, command.getTodo());
            System.out.println("Добавлено дело \"" + string + "\"");
            return;
        }
        String oldTodo = todoList.getTodos().get(index);
        todoList.edit(index, command.getTodo());
        System.out.println("Дело \"" + oldTodo + "\" заменено на \"" + command.getTodo() + "\"");
    }

    public static void deleteFromList(String string) {
        int index = Integer.parseInt(string);
        if (index + 1 >= todoList.getTodos().size()) {
            System.out.println("Дело с таким номером не существует");
            return;
        }
        String oldTodo = todoList.getTodos().get(index);
        todoList.delete(index);
        System.out.println("Дело \"" + oldTodo + "\" удалено");
    }

    public static Command parsCommand(String string) {
        Command command = new Command();
        int index = string.indexOf(' ');
        if (index == -1 || index + 1 == string.length()) {
            System.out.println("Команда не распознана...");
            printInfo();
            return null;
        }
        command.setTodo(string.substring(index + 1));
        command.setCommand(string.substring(0, index));
        return command;
    }

    public static void printInfo() {
        System.out.println("Информация о синтаксисе команд: ");
        System.out.println("\tINFO - Показывает информацию об командах;");
        System.out.println("\tLIST - выводит дела с их порядковыми номерами;");
        System.out.println("\t\tПример: LIST");
        System.out.println("\tADD - Добавляет дело в конец списка или дело на определённое место, " +
                "сдвигая остальные дела вперёд, если указать номер; если указан несуществующий индекс - " +
                "добавить в конец списка;");
        System.out.println("\t\tПример: ADD buy milk");
        System.out.println("\tEDIT - Заменяет дело с указанным номером; если указан несуществующий индекс - " +
                "ничего не делать;");
        System.out.println("\t\tПример: EDIT 0 make a cup of tea");
        System.out.println("\tDELETE - Удаляет; если указан несуществующий индекс - ничего не делать;");
        System.out.println("\t\tПример: DELETE 1");
    }
}
