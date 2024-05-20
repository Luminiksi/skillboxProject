package training.lesson_6_5;

public class Main {
    public static void main(String[] args) {
        workWithCalculator();

        System.out.println();
        System.out.println();

        workWithCar();
    }

    public static void workWithCar() {
        System.out.println("Работа с машиной:");
        Engine engine = new Engine(EngineType.PETROL, 1.6, 256);
        Car car = new Car(engine, CarType.SEDAN, 2600);
        System.out.println(car);
    }

    public static void workWithCalculator() {
        System.out.println("Работа с калькулятором:");
        int a = 4, b = 5;
        ArithmeticCalculator calculator = new ArithmeticCalculator(a, b);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + calculator.calculate(Operation.ADD));
        System.out.println("a - b = " + calculator.calculate(Operation.SUBTRACT));
        System.out.println("a * b = " + calculator.calculate(Operation.MULTIPLY));
    }
}
