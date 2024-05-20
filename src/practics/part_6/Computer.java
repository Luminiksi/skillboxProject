package practics.part_6;

public class Computer {
    private final String vendor;
    private final String name;

    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public double getWeight() {
        return processor.getWeight() + memory.getWeight() +
                storage.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public String toString() {
        String info = "Информация о сборке:\n";
        info += "Наименование системы: " + name + "\n";
        info += "Сборщик: " + vendor + "\n";
        info += processor.toString();
        info += memory.toString();
        info += storage.toString();
        info += screen.toString();
        info += keyboard.toString();
        info += "Общий вес сборки " + (getWeight() / 1000) + "кг." + "\n";
        return info;
    }
}