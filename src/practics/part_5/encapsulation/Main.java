package practics.part_5.encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        workWithCargo();

        System.out.println();
        System.out.println();

        workWithElevator();
    }

    public static void workWithElevator() {
        System.out.println("Тетсируем работу лифта");
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Введите номер этажа:");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            System.out.println("Сейчас вы находитесь на " + elevator.getCurrentFloor() + " этаже");
            System.out.println(" . . . ");
        }
    }

    public static void workWithCargo() {
        System.out.println("Тетсируем работу доставки");
        Dimensions dimensionsBase = new Dimensions(3, 4, 2);
        Cargo cargoBase = new Cargo(dimensionsBase, 23, "address_base", true, "reg_num_base_0987", true);
        System.out.println("Изначальный объект:");
        System.out.println(cargoBase);
        System.out.println();

        Dimensions dimensionsNew = new Dimensions(5, 1, 3);
        Cargo cargoD = cargoBase.setDimensions(dimensionsNew);
        Cargo cargoW = cargoBase.setWeight(5);
        Cargo cargoA = cargoBase.setAddress("new address");
        Cargo cargoCopy = cargoBase;
        cargoBase.setFlip(false);
        cargoBase.setFragile(false);
        cargoBase.setRegNumber("new_reg_num_123");

        System.out.println("Измененный начальный объект: ");
        System.out.println(cargoBase);
        System.out.println("Копированный объект(до изменения основного): ");
        System.out.println(cargoCopy);
        System.out.println("Измененный объект(до изменения основного) - габариты: ");
        System.out.println(cargoD);
        System.out.println("Измененный объект(до изменения основного) - вес: ");
        System.out.println(cargoW);
        System.out.println("Измененный объект(до изменения основного) - адрес: ");
        System.out.println(cargoA);
    }
}
