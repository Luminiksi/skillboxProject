package part_2.lesson_5.coffeMachine;

public class Main {
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

        boolean coffeeIsEnough = coffeeAmount >=cappucinoCoffeeRequired;

        if (!isBlocked && coffeeIsEnough && milkIsEnough) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }

       /* if (!isBlocked && coffeeAmount >=cappucinoCoffeeRequired &&
                (skimmedMilkAmount >= cappucinoMilkRequired ||
                        milkAmount >= cappucinoMilkRequired)) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }*/

        /*if (skimmedMilkAmount >= cappucinoMilkRequired ||
            milkAmount >= cappucinoMilkRequired ||
            lowLactoseMilkAmount >= cappucinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока не достаточно");
        }*/
    }
}