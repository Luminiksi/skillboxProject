package training.lesson_4_5;

public class Order {
    private int count = 0;
    private int totalCount = 0;

    public void addProduct(int productCount, int cost) {
        count = count + productCount;
        totalCount += cost;
    }

    public int getProductsCount() {
        return count;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
