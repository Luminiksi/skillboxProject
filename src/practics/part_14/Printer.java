package practics.part_14;

public interface Printer {
    void printBlackAndWhite();
    default void printColor() {
        System.out.println("Print color");
    }
}
