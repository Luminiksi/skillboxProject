package practics.part_14;

public class SimplePrinter1 implements Printer, LaserPrinter{
    @Override
    public void printBlackAndWhite() {
        System.out.println("Print black and white");
    }

    @Override
    public void printColor() {
        Printer.super.printColor();
    }
}
