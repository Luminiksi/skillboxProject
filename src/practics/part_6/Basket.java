package practics.part_6;

public class Basket {

    private static int count = 0;
    private static int totalCost = 0;
    private static int totalCount = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(double totalWeight) {
        this.totalWeight += totalWeight;
    }

    public void add(String name, int price, int count, double weight){
        add(weight);
        add(name, price, count);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        int allPrice = count * price;
        totalPrice = totalPrice + allPrice;
        increaseTotalCost(allPrice);
        increaseTotalCount(count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public double getTotalWeight(){
        return totalWeight;
    }

    private static void increaseTotalCost(int price) {
        totalCost += price;
    }

    private static void increaseTotalCount(int count) {
        totalCount += count;
    }

    public static double getAverageCost () {
        return (double) totalCost / totalCount;
    }

    public static double getAverageBasketCost () {
        return (double) totalCost / count;
    }
}
