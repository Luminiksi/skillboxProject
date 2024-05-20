package practics.part_6;

public class Memory {
    private final MemoryType type;
    private final int volume;
    private final double weight;

    public Memory(MemoryType type, int volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        String info = " Оперативная память: \n";
        info += "       Тип     : "+ type + "\n";
        info += "       Объём   : "+ volume + " Гб\n";
        info += "       Вес     : "+ weight + " грам.\n";
        return info;
    }
}
