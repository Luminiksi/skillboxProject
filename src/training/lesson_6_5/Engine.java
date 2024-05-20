package training.lesson_6_5;

public class Engine {
    private final EngineType engineType;
    private final double volume;
    private final int power;

    public Engine(EngineType engineType, double volume, int power) {
        this.engineType = engineType;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public String toString() {
        String info = "Тип двигателя: " + engineType + "\n";
        info += "Объем двигателя: " + volume + "\n";
        info += "Мощность двигателя: " + power + "\n";
        return info;
    }
}
