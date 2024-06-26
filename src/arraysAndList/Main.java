package arraysAndList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        lesson7();
    }

    public static void lesson7() {
        System.out.println("Lesson 6");
        lesson7Task1();
        System.out.println();
        lesson7Task2();
        System.out.println();
        lesson7Task3();
    }

    public static void lesson7Task3() {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(Arrays.asList(numbers));

        for (Integer value : values) {
            System.out.println(value);
        }
        System.out.println();

        Integer[] val = values.toArray(new Integer[0]);
        System.out.println(Arrays.toString(val));

        System.out.println();
    }

    public static void lesson7Task2() {
        System.out.println("\tlesson 7 task 2");
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Купить молока", "5 пакетов"));
        taskList.add(new Task("Покормить кота", "новым кормом!"));
        taskList.add(new Task("Сжечь секрктное", "Особенно из синей сумки!"));

        taskList.add(0, new Task("Очень срочная задача", ""));
        taskList.remove(1);
        taskList.set(1, new Task("Покормить лошадь", "Новым кормом"));

        for (Task task : taskList) {
            System.out.println(task);
        }
        System.out.println();
    }

    public static void lesson7Task1() {
        System.out.println("\tlesson 7 task 1");
        int certCount = 1000;
        int winnersRate = 100;
        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        ArrayList<Integer> winnerCerts = new ArrayList<>();
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            if (i % winnersRate == 0) {
                winnerCerts.add(certNumbers[i]);
            }
        }

        for (int i = 0; i < winnerCerts.size(); i++) {
            System.out.println(winnerCerts.get(i));
        }
        System.out.println();
        System.out.println("v2");
        for (Integer winnerNumber : winnerCerts) {
            System.out.println(winnerNumber);
        }
        System.out.println();
        System.out.println(winnerCerts.get(5));
        System.out.println();
    }

    public static void lesson5() {
        System.out.println("Lesson 5");
        lesson5Task1();
        lesson5Task2();
        lesson5Task3();
        lesson5Task4();
    }

    public static void lesson5Task1() {
        System.out.println("\tlesson 5 task 1");
        int[] values = {234, 79, 4342, 789};
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        System.out.println();
    }

    public static void lesson5Task2() {
        System.out.println("\tlesson 5 task 2");
        int[] a = {5, 6, 7};
        int[] b = {5, 6, 7};
        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.compare(a, b));
        System.out.println();
        int[] c = {5, 6, 8};
        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.compare(a, c));
        System.out.println();
        int[] j = {5, 6, 7, 8};
        System.out.println(Arrays.compare(j, a));
        System.out.println();
    }

    public static void lesson5Task3() {
        System.out.println("\tlesson 5 task 3");
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] firstElements = Arrays.copyOf(values, 5);
        System.out.println(Arrays.toString(firstElements));
        int[] fragment = Arrays.copyOfRange(values, 2, 4);
        System.out.println(Arrays.toString(fragment));
        System.out.println();
    }

    public static void lesson5Task4() {
        System.out.println("\tlesson 5 task 3");
        int[] values = new int[20];
        Arrays.fill(values, -1);
        System.out.println(Arrays.toString(values));
        System.out.println();
    }

    public static void lesson4() {
        Figure[][] board = new Figure[8][];
        board[0] = new Figure[] {
          new Figure(FigureColor.WHITE, FigureType.ROOK),
          new Figure(FigureColor.WHITE, FigureType.HORSE),
          new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
          new Figure(FigureColor.WHITE, FigureType.KING),
          new Figure(FigureColor.WHITE, FigureType.QUEEN),
          new Figure(FigureColor.WHITE, FigureType.ELEPHANT),
          new Figure(FigureColor.WHITE, FigureType.HORSE),
          new Figure(FigureColor.WHITE, FigureType.ROOK),
        };
        board[1] = new Figure[8];
        board[6] = new Figure[8];
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Figure(FigureColor.WHITE, FigureType.PAWN);
            board[6][i] = new Figure(FigureColor.BLACK, FigureType.PAWN);
        }
        board[7] = new Figure[] {
                new Figure(FigureColor.BLACK, FigureType.ROOK),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.KING),
                new Figure(FigureColor.BLACK, FigureType.QUEEN),
                new Figure(FigureColor.BLACK, FigureType.ELEPHANT),
                new Figure(FigureColor.BLACK, FigureType.HORSE),
                new Figure(FigureColor.BLACK, FigureType.ROOK),
        };

        for (int i = 2; i < 6; i++) {
            board[i] = new Figure[8];
        }

        for (int row = 0; row < 8; row++) {
            for (int cell = 0; cell < 8; cell++) {
                Figure figure = board[row][cell];
                System.out.print(figure == null ? "--" : figure);
                System.out.print(cell < 7 ? " " : "\n");
            }
        }
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
        lesson3Task5();
    }

    public static void lesson3Task1() {
        System.out.println("Task 1");
        int certCount = 1000;
        int[] certNumbers = new int[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
        }

        /*for (int i = 0; i < certNumbers.length; i++) {
            System.out.println("Сертификат №" + i + " с номером " + certNumbers[i]);
        }*/

        int winnersRate = 100;
        int[] winnerNumbers = new int[certNumbers.length / winnersRate];

        int winnerNumbersIndex = 0;
        for (int i = 0; i < certNumbers.length; i += winnersRate) {
            winnerNumbers[winnerNumbersIndex++] = certNumbers[i];
        }
    }

    public static void lesson3Task2() {
        System.out.println("Task 2");
        int certCount = 1000;
        int winnersRate = 100;
        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNumbers.length; i++) {
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnersRate == 0;
        }
    }

    public static void lesson3Task3() {
        System.out.println("Task 3");
        int[] rooms = {15, 22, 22, 23, 22, 22, 23};
        double roomArea = 5.72;

        double[] roomAreas = new double[rooms.length];
        for (int i = 0; i < rooms.length; i++) {
            roomAreas[i] = rooms[i] * roomArea;
        }
    }

    public static void lesson3Task4() {
        System.out.println("Task 4");
        Product[] products = {
                new Product("Молоко", 75),
                new Product("Масло", 120),
                new Product("Сыр", 180),
                new Product("Чайник", 1890),
                new Product("Фильтр для воды", 1200),
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for (Product product : products) {
            int price = product.getPrice();
            if (price >= MIN_PRICE_FOR_DISCOUNT) {
                product.setPrice((int) (price * (1 - discount)));
            }
        }

        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void lesson3Task5() {
        System.out.println("Task 5");
        ProductF[] products = {
                new ProductF("Молоко", 75),
                new ProductF("Масло", 120),
                new ProductF("Сыр", 180),
                new ProductF("Чайник", 1890),
                new ProductF("Фильтр для воды", 1200),
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;
        double discount = 0.1;
        for (int i = 0; i < products.length; i++) {
            int price = products[i].getPrice();
            if (price >= MIN_PRICE_FOR_DISCOUNT) {
                int newPrice = (int) (price * (1 - discount));
                products[i] = products[i].setPrice(newPrice);
            }
        }

        for (ProductF product : products) {
            System.out.println(product);
        }
    }

    public static void lesson2() {
        System.out.println("Lesson 2");
        int[] floors = {3, 10, 17, 22, 16, 14};
        floors[0] = 555;
        System.out.println(floors[0]);
        System.out.println(floors.length);
    }
}
