package training.lesson_6_5;

public class ArithmeticCalculator {
    private int a, b;
    private Operation operation;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate(Operation operation) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
        };
    }
}
