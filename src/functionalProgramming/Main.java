package functionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        lesson5Task1();
//        lesson5Task2();
        myTest();
    }

    public static void lesson5Task2() {
        Computer computer = new Computer(new SoundCard(new USB("2.0.4344")));

//        Тут будет ошибка, если каок-то из объектов будет null, поэтому надо написать большую проверку, чтобы такого не было
//        String version = computer.getSoundCard().getUsb().getVersion();
        String version = "N/A";
        /*if (computer != null) {
            SoundCard soundCard = computer.getSoundCard();
            if (soundCard != null) {
                USB usb = soundCard.getUsb();
                if (usb != null) {
                    version = usb.getVersion();
                }
            }
        }*/
        System.out.println(version);
        //Если у нас будет Optional прописано, тогда можно написать так:

        System.out.println();
        System.out.println("Work with Optional:");
        Optional<Computer> optionalComputer = Optional.of(computer);
        Optional<Computer> optionalComputer1 = Optional.empty();
        System.out.println("isPresent for NOT empty object");
        System.out.println(optionalComputer.isPresent());
        System.out.println("isPresent for empty object");
        System.out.println(optionalComputer1.isPresent());
        System.out.println("isEmpty for empty object");
        System.out.println(optionalComputer1.isEmpty());
        System.out.println("isEmpty for NOT empty object");
        System.out.println(optionalComputer.isEmpty());
        System.out.println("ifPresent for NOT empty object");
        optionalComputer.ifPresent(comp -> {
            System.out.println("Computer is exist");
        });
        System.out.println("ifPresent for empty object");
        optionalComputer1.ifPresent(comp -> System.out.println("Computer is exist"));
        System.out.println();

        Computer comp1 = optionalComputer.orElse(new Computer(new SoundCard(new USB("default"))));
        Computer comp2 = optionalComputer1.orElse(new Computer(new SoundCard(new USB("default"))));
        System.out.println("orElse for NOT empty object");
        System.out.println(comp1.getSoundCard().getUsb().getVersion());
        System.out.println("orElse for empty object");
        System.out.println(comp2.getSoundCard().getUsb().getVersion());
        System.out.println();

        System.out.println("orElseGet for empty object");
        Optional<String> optional = Optional.empty();
        System.out.println(optional.orElseGet(() -> getAnotherString()));
        System.out.println(optional.orElseGet(Main::getAnotherString));
        System.out.println();

        Optional<String> optional1 = Optional.ofNullable("sdfsf");
        System.out.println("orElseThrow for NOT empty object");
        System.out.println(optional1.orElseThrow(() -> new RuntimeException()));

        /*System.out.println("orElseThrow for empty object");
        System.out.println(optional.orElseThrow(RuntimeException::new));
        System.out.println();*/

        String newVersion = Optional.ofNullable(computer.getSoundCard())
                .map(soundCard -> soundCard.getUsb())
                .map(usb -> usb.getVersion())
                .orElse("N/A");
        System.out.println("for NOT empty object");
        System.out.println(newVersion);

        Computer computer1 = new Computer(null);
        String newVersion2 = Optional.ofNullable(computer1.getSoundCard())
                .map(soundCard -> soundCard.getUsb())
                .map(usb -> usb.getVersion())
                .orElse("N/A");
        System.out.println("for empty object");
        System.out.println(newVersion2);

        Computer computer2 = new Computer(null);
        String newVersion3 = Optional.ofNullable(computer2.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .orElse("N/A");
        System.out.println("for empty object");
        System.out.println(newVersion3);
        System.out.println();


        System.out.println("Filter for true");
        String newVersion4 = Optional.ofNullable(computer.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .filter(ver -> ver.equals(newVersion))
                .orElse("N/A");
        System.out.println(newVersion4);

        System.out.println("Filter for false");
        String newVersion5 = Optional.ofNullable(computer.getSoundCard())
                .map(SoundCard::getUsb)
                .map(USB::getVersion)
                .filter(ver -> !ver.equals(newVersion))
                .orElse("N/A");
        System.out.println(newVersion5);

        Computer nullComputer = null;
        assert nullComputer != null : "Computer is null...";
    }

    public static void lesson5Task1() {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        System.out.println(numbers.get(5).toUpperCase());

    }

    private static String getAnotherString() {
        return "Another string";
    }

    private static void myTest() {
//        Почему-то не хочет отрабатывать...
//        По крайней мере, так как это было описано в видео (т.е. с исключениями)
        System.out.println(1);
        Computer nullComputer = null;
        assert nullComputer != null : "Computer is null...";
        System.out.println(2);
        assert nullComputer == null : "Computer is null...";
        System.out.println(3);
    }
}
