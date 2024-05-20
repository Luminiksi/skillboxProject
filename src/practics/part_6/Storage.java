package practics.part_6;

public class Storage {
    private final StorageType type;
    private final int volume;
    private final double weight;

    public Storage(StorageType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public StorageType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String info = " Накопитель информации: \n";
        info += "       Тип             : "+ type + "\n";
        info += "       Объём памяти    : "+ volume + " Тб\n";
        info += "       Вес             : "+ weight + " грам.\n";
        return info;
    }
}
