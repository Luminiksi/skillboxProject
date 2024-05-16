package fillingStation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 420;
        boolean hasDiscount = amount > 10;
//        альтернатива задания типа переменной (автоматический выбор типа)
//        var hasDiscount = amount > 10;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        int maxAmount = 400;
        double discount = 0.1;

        String wrongFuelTypeMessage = "Неверный тип топлива!";

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println(wrongFuelTypeMessage);
        }

        if (amount < 1) {
            System.out.println("Указано слишком малое количество топлива");
            amount = 0;
        } else if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
            amount = maxAmount;
        }

        if (hasDiscount) {
//            прописываем скидку 10%
//            fuelPrice = fuelPrice - 0.1 * fuelPrice;
//            а теперь по умному
//            fuelPrice *= 0.9;
            fuelPrice *= 1 - discount;
        }

        String fuelPriceMessage = "Цена выбранного топлива: " + fuelPrice + " руб.";
        System.out.println(fuelPriceMessage);

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " +  totalPrice + " руб.");
    }
}
