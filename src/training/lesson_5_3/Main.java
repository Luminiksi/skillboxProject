package training.lesson_5_3;

public class Main {
    public static void main(String[] args) {
        workWithCountry();

        System.out.println();
        System.out.println();

        workWithBooks();
    }

    public static void workWithCountry() {
        System.out.println("Work with country");
        Country country = new Country("MyCountry");
        country.setCapital("Capital");
        country.setAccessSea(true);
        country.setArea(544023.234);
        System.out.println("Country name: " + country.getName());
        System.out.println("Capital: " + country.getCapital());
        System.out.println("Area: " + country.getArea());
        System.out.println("Is access of a sea: " + country.isAccessSea());
    }

    public static void workWithBooks() {
        System.out.println("Work with book");
        Book book = new Book("My book", "F I O", true);
        book.setPages(325);
        book.setYear(2024);
        book.setPublishHouse("New HOUSE");
        System.out.println("The book");
        System.out.println("Author - " + book.getAuthor());
        System.out.println("Name - " + book.getName());
        System.out.println("Is electronic book - " + book.isElectronic());
        System.out.println("Pages - " + book.getPages());
        System.out.println("Year - " + book.getYear());
        System.out.println("Publish house name - " +  book.getPublishHouse());
    }
}
