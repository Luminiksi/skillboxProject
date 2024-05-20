package driverlessCar;

public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf("ROBOT") ;
        GearBox gearBox = new GearBox(type);

        System.out.println(gearBox.getType());
    }
}
