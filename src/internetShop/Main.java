package internetShop;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("молоко", 56);
        Order order = new Order();
        order.addProduct(product);
        System.out.println(product);
    }
}
