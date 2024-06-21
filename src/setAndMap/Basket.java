package setAndMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private TreeMap<Product, Integer> products;

    public Basket() {
        this.products = new TreeMap<>(new ProductComparator());
    }

    public void add(Product product, int count) {
        if (!products.containsKey(product)) {
            products.put(product, 0);
        }
        products.put(product, products.get(product) + count);
    }

    public void add(Product product) {
        add(product, 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
//        первый вариант прохождение по мапе
        /*for (Product product : products.keySet()) {
            builder.append(product);
            builder.append(" - ");
            builder.append(products.get(product));
            builder.append("\n");
        }*/
//        второй вариант прохождение по мапе
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            builder.append(entry.getKey());
            builder.append(" - ");
            builder.append(entry.getValue());
            builder.append("\n");
        }
        
        return builder.toString();
    }
}
