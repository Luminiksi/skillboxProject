package internetShop;

public class Main {

    public static void main(String[] args) {
        createBasket();
        Session session = new Session();
        System.out.println(Basket.getCount());
    }

    public static void createBasket() {
        Basket basket = new Basket("товары", 1231);
    }
}
