package numbersAndDates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.IsoFields;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        practic1();

        System.out.println();

        practic2();

        System.out.println();

        practic3();

        System.out.println();

        practic4();

        System.out.println();

        practic4();

        System.out.println();

        practic5();

        System.out.println();

        practic6();

        System.out.println();

        practic7();

        System.out.println();

        practic8();

        System.out.println();

        practic9();

    }
    
    public static void practic9(){
        System.out.println("Из урока 9 часть");
        //ZoneOffset.ofHours(3) - часовой пояс для Мссквы
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toEpochSecond(ZoneOffset.ofHours(3)));
        
    }

    public static void practic8(){
        System.out.println("Из урока 8 часть");
        //ZoneOffset.ofHours(3) - часовой пояс для Мссквы
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis() / 1000, 0 , ZoneOffset.ofHours(3));
        System.out.println(now);

    }

    public static void practic7(){
        System.out.println("Из урока 7 часть");
        long start = System.currentTimeMillis();

        String line = "";
        for (int i = 0; i < 100000; i++) {
            line += Math.random();
        }

        System.out.println(System.currentTimeMillis() - start);

    }

    public static void practic6() {
        System.out.println("Из урока 6 часть");
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now().minusDays(2);
        if (time1.isBefore(time2)) {
            System.out.println("time1 is after time2");
        }
        System.out.println(time1.compareTo(time2));
        System.out.println(time1.until(time2, IsoFields.WEEK_BASED_YEARS));
    }

    public static void practic5() {
        System.out.println("Из урока 5 часть");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).localizedBy(new Locale("us"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }

    public static void practic4() {
        System.out.println("Из урока 4 часть");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }

    public static void practic3() {
        System.out.println("Из урока 3 часть");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(formatter.format(now));
    }

    public static void practic2() {
        System.out.println("Из урока 2 часть");
        String date = "23/01/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }


    public static void practic1 () {
        System.out.println("Из урока 1 часть");
        Date now = new Date();
        System.out.println(now);

        System.out.println();

        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println();

        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        System.out.println();

        LocalDate date = LocalDate.of(1987, 4, 25);
        System.out.println(date);
        System.out.println(date.plusYears(18));

        System.out.println();

        LocalDateTime nowNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowNY);
    }
}
