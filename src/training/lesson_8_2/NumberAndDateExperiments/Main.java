package training.lesson_8_2.NumberAndDateExperiments;

public class Main {
    public static void main(String[] args) {
        workWithCalculate();
        System.out.println();
    }

    public static void workWithCalculate() {
        System.out.println("Work with calculate:");
        System.out.println("Если у нас 1999 - " + MoneyCalculator.calculateCassetteCount(1999));
        System.out.println("Если у нас 2000 - " + MoneyCalculator.calculateCassetteCount(2000));
        System.out.println("Если у нас 2001 - " + MoneyCalculator.calculateCassetteCount(2001));
        System.out.println("Если у нас 2500 - " + MoneyCalculator.calculateCassetteCount(2500));
        System.out.println("Если у нас 4000 - " + MoneyCalculator.calculateCassetteCount(4000));
        System.out.println("Если у нас 4001 - " + MoneyCalculator.calculateCassetteCount(4001));
    }
}
