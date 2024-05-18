package training.lesson_4_3;

public class Methods2 {
    public static void main(String[] args) {
        calculateTriagleSquare(3, 4, 5);
    }

    public static void calculateTriagleSquare(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(square);

    }
}
