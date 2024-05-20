package training.lesson_4_7;

public class Printer {
    private String queue = "";
    private int pagesInQueue = 0;
    private int pagesPrinted = 0;

    public void append(String text) {
        append(text, "Документ без имени", 1);
    }

    public void append(String text, String name) {
        append(text, name, 1);
    }

    public void append(String text, int pages) {
        append(text, "Документ без имени", pages);
    }

    public void append(String text, String name, int pages) {
        queue += "\n" + name + " - " + text;
        this.pagesInQueue += pages;
    }

    public void clean() {
        queue = "";
        pagesInQueue = 0;
    }

    public void print() {
        System.out.println(queue);
        pagesPrinted += pagesInQueue;
        clean();
    }

    public int getPendingPagesCount() {
        return pagesInQueue;
    }

    public int getPrintedPagesCount() {
        return pagesPrinted;
    }
}
