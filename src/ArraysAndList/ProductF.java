package ArraysAndList;

public class ProductF {
    private final String name;
    private final int price;

    public ProductF(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductF setName(String name) {
        return new ProductF(name, price);
    }

    public int getPrice() {
        return price;
    }

    public ProductF setPrice(int price) {
        return new ProductF(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
