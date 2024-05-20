package Immutability;

public class Main {
    public static void main(String[] args) {
        workWithProduct();

        System.out.println();
        System.out.println();

        workWithBook();
    }

    public static void workWithProduct() {
        System.out.println("Work with product");
        Product product = new Product("product", "asdf1234as");
        product.setPrice(345);
        System.out.println("Product's info:");
        System.out.println("Name - " + product.getName());
        System.out.println("Price - " + product.getPrice());
        System.out.println("Bar code - " + product.getBarCode());
    }

    public static void workWithBook() {
        System.out.println("Work with book");
        Book book = new Book("Name", "Author", 325, 230423942);
        System.out.println("Book's info:");
        System.out.println("Name - " + book.getName());
        System.out.println("Author - " + book.getAuthor());
        System.out.println("Pages - " + book.getPages());
        System.out.println("ISBN - " + book.getIsbn());
    }
}
