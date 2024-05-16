package practics.part_2.task_1;

/*Изначальный файл, с которого надо было делать
* Скопировала все с него в свой класс CheckIngredients*/
public class Main {
    public static void main(String[] args) {
        int milkAmount = 200; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8; // items

        // Example
        // apples - 5
        if (appleCount >= 5) {
            System.out.println("Apple juice");
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        System.out.println("Pancakes");

        // milk - 300 ml, powder - 5 g, eggs - 5
        System.out.println("Omelette");

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        System.out.println("Apple pie");
    }
}