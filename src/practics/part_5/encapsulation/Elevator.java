package practics.part_5.encapsulation;

public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean moveDown() {
        if (currentFloor - 1 < minFloor) {
            return false;
        }
        currentFloor--;
        System.out.println("Этаж - " + currentFloor);
        return true;
    }

    public boolean moveUp() {
        if (currentFloor + 1 > maxFloor) {
            return false;
        }
        currentFloor++;
        System.out.println("Этаж - " + currentFloor);
        return true;
    }

    public boolean move(int floor) {
        if (floor < minFloor) {
            System.out.println("Такого этажа не существует!");
            System.out.println("Нижний этаж - " + minFloor);
            return false;
        }
        if (floor > maxFloor) {
            System.out.println("Такого этажа не существует!");
            System.out.println("Последний этаж - " + maxFloor);
            return false;
        }
        if (floor < currentFloor){
            do {
                moveDown();
            }while (floor != currentFloor);
        } else {
            do {
                moveUp();
            }while (floor != currentFloor);
        }
        return true;
    }
}
