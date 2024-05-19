package internetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;

    public void add(String name, int price) {
        if(contains(name)) {
            return;
        }
        items = items + name + " - " + price + "\n";
        totalPrice += price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        if(items.contains(name)) {
            return true;
        }
        return false;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }

    }
}
