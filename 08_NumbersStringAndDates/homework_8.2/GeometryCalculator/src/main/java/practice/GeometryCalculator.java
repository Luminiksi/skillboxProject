package practice;

public class GeometryCalculator {

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return -1;
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            return false;
        }
        return true;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (!isTrianglePossible(a, b, c)) {
            return -1;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
