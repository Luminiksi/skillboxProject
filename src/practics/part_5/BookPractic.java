package practics.part_5;

/*Т.к. Book класс уже в практике тут был, создала этот класс(по практике 5.12 1 задание)*/
public class BookPractic {
    private final String name;
    private final String author;
    private final int pages;
    private final String isbn;

    public BookPractic(String name, String author, int pages, String isbn) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getIsbn() {
        return isbn;
    }
}
