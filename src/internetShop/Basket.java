package internetShop;

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;

    private static int timeout;
    private static PeriodType periodType = PeriodType.MONTH;

//    Этот блок запускается при первом вызове данного класса
    static {
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMonth = 30;
        timeout = secondsInHour * hoursInDay * (periodType == PeriodType.WEEK ? daysInWeek : daysInMonth);
    }

    /*
    Данный блок аналогичен верхнему static:
    private static int timeout = getTimeout();
    private static PeriodType periodType = PeriodType.MONTH;

    private static int getTimeout() {
        int secondsInHour = 3600;
        int hoursInDay = 24;
        int daysInWeek = 7;
        int daysInMonth = 30;
        timeout = secondsInHour * hoursInDay * (periodType == PeriodType.WEEK ? daysInWeek : daysInMonth);
    }
     */

    public Basket() {
        increaseCount(1);
        items = "Список товаров: ";
        this.limit = 1000000;
    }

    public Basket(int totalPriceLimit) {
        this();
        limit = totalPriceLimit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items += items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if(contains(name)) {
            return;
        }
        if (totalPrice + price * price >= limit) {
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice += price * price;

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

    public static int getCount(){
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count += count;
    }
}
