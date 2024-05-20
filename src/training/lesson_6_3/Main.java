package training.lesson_6_3;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("product 1", 45);
        Product product2 = new Product("product 2", 31);
        Product product3 = new Product("product 3", 7);
        System.out.println("Count - " + Product.getCount());
        System.out.println("Average Price - " + Product.getAveragePrice());
    }
}
