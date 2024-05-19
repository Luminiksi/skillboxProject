package training.lesson_4_5;

public class Order {
    private int count = 0;

    public void addProduct(int productCount) {
        count = count + productCount;
    }

    public int getCount() {
        return count;
    }
}
