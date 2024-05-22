package practice;

import java.util.Scanner;

public class TrucksAndContainers {
    public static final int CONTAINERS_IN_TRUCK = 12;
    public static final int BOXES_IN_CONTAINER = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
        int boxesInTruck = BOXES_IN_CONTAINER * CONTAINERS_IN_TRUCK;
        int containersCount = 0;
        int trucksCount = 0;

        for (int i = 1; i <= boxes; i++) {
            if (i % boxesInTruck == 1) {
                trucksCount++;
                System.out.println("Грузовик: " + trucksCount);
            }
            if (i % BOXES_IN_CONTAINER == 1) {
                containersCount++;
                System.out.println("\tКонтейнер: " + containersCount);
            }
            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucksCount + " шт.");
        System.out.println("контейнеров - " + containersCount + " шт.");
    }

}
