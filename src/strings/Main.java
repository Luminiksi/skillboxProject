package strings;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String name = "Анастасия";
        String surname = "Басова";
        LocalDate birthday = LocalDate.of(1994, 1, 31);

        String personInfo = name + " " + surname + " - " + birthday;
        System.out.println(personInfo);
    }
}
