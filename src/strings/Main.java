package strings;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        lesson3();
    }

    public static void lesson3() {
        int age = 37;
        String name = "Анна";
        String personInfo = name + " - " + age + " лет";
        String value = Integer.toString(age);

        Double weight = 3.45;
        double weig = 3.45;
        value = weight.toString();
        value = Double.toString(weig);
        value = String.valueOf(weig);

        value = "234524";
        int count = Integer.parseInt(value);
        System.out.println(count);
        try {
            value = "234524234234243";
            count = Integer.parseInt(value);
            System.out.println(count);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void lesson2() {
        String name = "Анастасия";
        String surname = "Басова";
        LocalDate birthday = LocalDate.of(1994, 1, 31);

        String personInfo = name + " " + surname + " - " + birthday;
        System.out.println(personInfo);
    }
}
