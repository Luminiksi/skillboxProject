package practics.part_6;

public class Main {

    public static void main(String[] args) {
        Processor processor1 = new Processor(2.44, 6, "ООО Производитель 1", 50);
        Processor processor2 = new Processor(2.65, 9, "ООО Производитель 2", 45);
        Memory memory1 = new Memory(MemoryType.DDR3, 8, 20);
        Memory memory2 = new Memory(MemoryType.DDR4, 16, 25);
        Storage storage1 = new Storage(StorageType.SSD, 2,252);
        Storage storage2 = new Storage(StorageType.HDD, 8, 309);
        Screen screen1 = new Screen(27, ScreenType.IPS, 4000);
        Screen screen2 = new Screen(31, ScreenType.TN, 5000);
        Keyboard keyboard1 = new Keyboard(KeyboardType.ANALOG, true, 1250);
        Keyboard keyboard2 = new Keyboard(KeyboardType.OPTOMECHANICAL, false, 1350);

        Computer computer1 = new Computer("Vendor 1", " Name 1");
        Computer computer2 = new Computer("Vendor 2", " Name 2");
        Computer computer3 = new Computer("Vendor 3", " Name 3");
        computer1.setKeyboard(keyboard1);
        computer2.setKeyboard(keyboard2);
        computer3.setKeyboard(keyboard1);
        computer1.setMemory(memory1);
        computer2.setMemory(memory2);
        computer3.setMemory(memory2);
        computer1.setScreen(screen1);
        computer2.setScreen(screen2);
        computer3.setScreen(screen2);
        computer1.setStorage(storage1);
        computer2.setStorage(storage2);
        computer3.setStorage(storage1);
        computer1.setProcessor(processor1);
        computer2.setProcessor(processor2);
        computer3.setProcessor(processor1);

        System.out.println("Информация по первой сборке:");
        System.out.println(computer1);
        System.out.println("Информация по второй сборке:");
        System.out.println(computer2);
        System.out.println("Информация по третьей сборке:");
        System.out.println(computer3);

    }
}
