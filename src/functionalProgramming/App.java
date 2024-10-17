package functionalProgramming;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Name", 123);
        System.out.println(product);
        System.out.println();

//        Похоже Value не создает сеторы
        /*product.setName("Product Name");
        System.out.println("Product name = " + product.getName());
        product.setPrice(10);
        System.out.println("Product price = " + product.getPrice());*/
        System.out.println();
        System.out.println(product );
        System.out.println();
    }
}
