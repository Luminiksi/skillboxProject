package ArraysAndList;

public class Main {
    public static void main(String[] args) {
        lesson2();
    }

    public static void lesson2() {
        int[] floors = {3, 10, 17, 22, 16, 14};
        floors[0] = 555;
        System.out.println(floors[0]);
        System.out.println(floors.length);
    }
}
