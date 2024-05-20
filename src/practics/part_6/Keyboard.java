package practics.part_6;

public class Keyboard {
    private final KeyboardType type;
    private final boolean backlight;
    private final double weight;

    public Keyboard(KeyboardType type, boolean backlight, double weight) {
        this.type = type;
        this.backlight = backlight;
        this.weight = weight;
    }

    public KeyboardType getType() {
        return type;
    }

    public boolean isBacklight() {
        return backlight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String info = " Клавиатура: \n";
        info += "       Тип                 : " + type + "\n";
        info += "       Наличие подсветки   : " + (backlight ? "Да" : "Нет") + "\n";
        info += "       Вес                 :" + weight / 1000 + " кг.\n";
        return info;
    }
}
