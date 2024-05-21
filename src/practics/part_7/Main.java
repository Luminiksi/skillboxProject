package practics.part_7;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        for (int i = 'А'; i <= 'я'; i++) {
            char ch = (char) i;
            System.out.println(i + " - " + ch);
        }

        int e = 'ё';
        char ch = (char) e;
        System.out.println(e + " - " + ch);

        e = 'Ё';
        ch = (char) e;
        System.out.println(e + " - " + ch);
    }
}
