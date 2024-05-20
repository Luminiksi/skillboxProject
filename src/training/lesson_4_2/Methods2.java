package training.lesson_4_2;

public class Methods2 {
    public static int i = 0;

    public static int max = 10;

    public static void main(String[] args) {
        iterate();
    }

    public static void iterate() {
        if (i < max) {
            i++;
            System.out.println(i);
            iterate();
        }
    }
}
