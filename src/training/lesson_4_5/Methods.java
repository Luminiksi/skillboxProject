package training.lesson_4_5;

public class Methods {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addProduct(54);
        order1.addProduct(600);
        System.out.println("Итого по первому заказу: " + order1.getCount());

        Order order2 = new Order();
        order2.addProduct(436);
        order2.addProduct(234);
        order2.addProduct(34);
        System.out.println("Итого по вторпому заказу: " + order2.getCount());
    }
}
