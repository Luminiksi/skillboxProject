package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.ENGLISH);

        String collection = "";

        for (int i = 0; ; i++) {
            LocalDate newYearDate = date.plusYears(i);
            if (newYearDate.getYear() == now.getYear()) {
                if (newYearDate.getMonth().getValue() <= now.getMonth().getValue()
                        && newYearDate.getDayOfMonth() <= now.getDayOfMonth()) {
                    collection += i + " - " + formatter.format(newYearDate);
                }
                break;
            }
            collection += i + " - " + formatter.format(newYearDate) + "\n";
        }

        return collection;
    }
}
