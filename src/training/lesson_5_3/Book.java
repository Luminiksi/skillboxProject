package training.lesson_5_3;

public class Book {
    private String name;
    private int pages;
    private String author;
    private int year;
    private String publishHouse;
    private boolean isElectronic;

    public Book(String name, String author, boolean isElectronic) {
        this.name = name;
        this.author = author;
        this.isElectronic = isElectronic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    public void setElectronic(boolean electronic) {
        isElectronic = electronic;
    }
}
