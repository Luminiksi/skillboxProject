package training.lesson_6_3;

public class Product {
    private final String name;
    private final int price;

    private static int count = 0;
    private static int totalPrice = 0;

    public Product(String name, int age) {
        this.name = name;
        this.price = age;
        count++;
        totalPrice += price;
    }

    public static int getCount() {
        return count;
    }

    public static double getAveragePrice() {
        return (double) totalPrice / count;
    }
}
