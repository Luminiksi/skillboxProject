package part_2.lesson_6.coffeMachine;

public class Main2 {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1000;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoMilkRequired;

        boolean coffeeIsEnough = coffeeAmount >= cappucinoCoffeeRequired;
        if (isBlocked) {
            System.out.println("Кофе-машина заблокирвоана");
        } else if (coffeeIsEnough && milkIsEnough) {
            System.out.println("Готовим кофе");
        } else if (!coffeeIsEnough) {
            System.out.println("Кофе не достаточно");
        } else if (!milkIsEnough) {
            System.out.println("Молока не достаточно");
        }
    }
}