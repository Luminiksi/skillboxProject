package ArraysAndList;

public class Main {
    public static void main(String[] args) {
        lesson3();
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
