package internetShop;

public class Main {

    public static void main(String[] args) {
        workWithDeliveryOrder();
    }

    public static void workWithDeliveryOrder() {
        DelveryOrder order = new DelveryOrder(DeliveryType.PEDESTRIAN, Fragile.NO, Cold.YES);
    }

    public static void workWithBasket() {
        createBasket();
        Session session = new Session();
        System.out.println(Basket.getCount());
    }

    public static void createBasket() {
        Basket basket = new Basket("товары", 1231);
    }
}
