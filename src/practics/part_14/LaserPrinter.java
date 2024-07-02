package practics.part_14;

public interface LaserPrinter {
    default void printColor() {
        System.out.println("LaserPrintColor");
    }
}
