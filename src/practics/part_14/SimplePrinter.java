package practics.part_14;

public class SimplePrinter implements Printer{
    @Override
    public void printBlackAndWhite() {
        System.out.println("Print black and white");
    }

    @Override
    public void printColor() {
        System.out.println("Print more color");
    }
}
