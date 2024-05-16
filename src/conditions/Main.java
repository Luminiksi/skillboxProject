package conditions;

public class Main {
    public static void main(String[] args) {
        int maxWeight = 5000;
        int minCost = 1000;

        int weight = 3200;
        int cost = 1750;

        if (weight <= maxWeight && cost >= minCost) {
            System.out.println("Доставка бесплатная");
        }

        if (weight > maxWeight || cost < minCost) {
            System.out.println("Доставка платная");
        }
    }
}