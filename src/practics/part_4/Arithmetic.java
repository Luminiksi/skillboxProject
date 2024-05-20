package practics.part_4;

public class Arithmetic {
    int a, b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int comp() {
        return a * b;
    }

    public int max () {
        if (a >= b) {
            return  a;
        }
        return b;
    }

    public int min () {
        if (a <= b) {
            return  a;
        }
        return b;
    }
}
