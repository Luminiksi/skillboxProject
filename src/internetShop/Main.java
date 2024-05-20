package internetShop;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket("товары", 1231);
        Session session = new Session();
        System.out.println(Basket.count);
    }
}
