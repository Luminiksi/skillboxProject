package coffeMachine;

public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;

        int cappucinoMilkRequired = 60;
        int cappucinoCoffeeRequired = 15;

        /*if (!isBlocked) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Кофе-машина заблокирвоана");
        }

        if (milkAmount >= cappucinoCoffeeRequired ||
                skimmedMilkAmount >= cappucinoMilkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока не достаточно");
        }
        if (coffeeAmount >= cappucinoCoffeeRequired &&
            milkAmount >= cappucinoMilkRequired) {
            System.out.println("Готовим капучино");
        } else {
            System.out.println("Ингредиентов не достаточно");
        }*/

        if (!isBlocked && milkAmount >= cappucinoMilkRequired &&
                coffeeAmount >= cappucinoCoffeeRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Что-то пошло не так :(");
        }
    }
}