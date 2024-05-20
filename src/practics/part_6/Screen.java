package practics.part_6;

public class Screen {
    private final int diagonal;
    private final ScreenType type;
    // тут в граммах
    private final double weight;

    public Screen(int diagonal, ScreenType type, double weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public ScreenType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String info = " Экран: \n";
        info += "       Диагональ   : "+ diagonal + " дюйм\n";
        info += "       Тип         : "+ type + "\n";
        info += "       Вес         : "+ (weight / 1000) + " кг.\n";
        return info;
    }
}
