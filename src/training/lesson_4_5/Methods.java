package training.lesson_4_5;

public class Methods {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addProduct(201, 40000);
        order1.addProduct(317, 12000);
        System.out.println("Информация по первому заказу:");
        System.out.println("Количество :" + order1.getProductsCount());
        System.out.println("Стоимость :" + order1.getTotalCount());
        System.out.println();

        Order order2 = new Order();
        order2.addProduct(23, 5450);
        order2.addProduct(45, 123300);
        order2.addProduct(250, 34000);
        System.out.println("Информация по второму заказу:");
        System.out.println("Количество :" + order2.getProductsCount());
        System.out.println("Стоимость :" + order2.getTotalCount());

    }
}
