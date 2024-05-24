package strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //        (^) — символ, обозначающий отрицание множества
    public static final String REGEX = "[^0-9]";

    public static void main(String[] args) {
        lesson7();
    }

    public static void lesson7() {
        System.out.println(ANSI_CYAN + "Lesson 5" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Регулярные выражения" + ANSI_RESET);
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 1:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Замена одних фрагментов строк на другие" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Приводим телефоны к формату '79037123754'" + ANSI_RESET);
        System.out.println("Исходные данные:");
        String phone1 = "+7 903 712-37-54";
        System.out.println("phone1: " + phone1);
        String phone2 = "7 (903) 968-60-45";
        System.out.println("phone2: " + phone2);
        String phone3 = "7999-666-66-66";
        System.out.println("phone3: " + phone3);
        String phone4 = "7(903)9616245";
        System.out.println("phone4: " + phone4);
        System.out.println();

        System.out.println("Итог:");
        System.out.println("phone1: " + formatPhoneNumber(phone1));
        System.out.println("phone2: " + formatPhoneNumber(phone2));
        System.out.println("phone3: " + formatPhoneNumber(phone3));
        System.out.println("phone4: " + formatPhoneNumber(phone4));

        /*Другой пример:
        * String regex = "[0-9a-f]";
        * Такое регулярное выражение будет соответствовать любому символу, являющемуся цифрой или буквой от a до f.*/
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 2:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Разбиение строк на фрагментые" + ANSI_RESET);
        String text = "I know something about it";
        String[] words = text.split("\\s");
//        Обратный слеш и буква s — это любой пробельный символ
//        Метод строки split разделит наш текст по пробелам
        System.out.println("Исходная строка: {" + text + "}");
        System.out.println("Получено:");
        for (int i = 0; i < words.length; i++) {
            System.out.println("\t" + words[i]);
        }
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 3:" + ANSI_RESET);
        text = "I  know\tsomething   about\n  it";
        System.out.println("Исходная строка: {" + text + "}");
        System.out.println("С применением .split(\"\\\\s\"):");
        words = text.split("\\s");
        for (int i = 0; i < words.length; i++) {
            System.out.println("\t" + words[i]);
        }
        System.out.println("С применением .split(\"\\\\s+\"):");
        words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            System.out.println("\t" + words[i]);
        }
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 4:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Проверка соответствия строк шаблону" + ANSI_RESET);
        String number = "А674МР197";
        System.out.println("Изначальная строка: {" + number + "}");
        String lettersRange = "[АВЕКМНОРСТУХ]";
        String regex = lettersRange + "[0-9]{3}" + lettersRange + "{2}[0-9]{2,3}";
        System.out.println("Регулярное выражение: " + regex);
        System.out.println(ANSI_PURPLE + "Где:");
        System.out.println("\t[АВЕКМНОРСТУХ] - первая буква из данного множества");
        System.out.println("\t[0-9]{3} - затем 3 цифры (от 0 до 9)");
        System.out.println("\t[АВЕКМНОРСТУХ]{2} - две буквы из данного множества");
        System.out.println("\t[0-9]{2,3} - две или 3 цифры от 0 до 9, причем" +
                "числа 2 и 3 через запятую в фигурных скобках — это не перечисление, а значения «от и до».\n" +
                "\t\t\t\tНапример, {2,10} означало бы, что тот или иной символ может встречаться в проверяемой строке от двух до десяти раз." + ANSI_RESET);
        System.out.println("Получаем:");
        System.out.println(number.matches(regex));

        System.out.println("тест задания с русской А");
        String number1 = "А674МР197";
        String lettersRange1 = "[АВЕКМНОРСТУХ]";
        String regex1 = lettersRange1 + "[0-9]{3}" +
                lettersRange1 + "{2}[0-9]{2,3}";
        System.out.println(number1.matches(regex1));

        System.out.println("тест задания с латнской A");
        String number2 = "A674МР197";
        String lettersRange2 = "[АВЕКМНОРСТУХ]";
        String regex2 = lettersRange2 + "[0-9]{3}" +
                lettersRange2 + "{2}[0-9]{2,3}";
        System.out.println(number2.matches(regex2));

        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 5:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Поиск фрагментов строк, соответствующих шаблону" + ANSI_RESET);
        String text1 = "Алексей, добрый день!\nМой гитхаб — https://github.com/, а также ссылка на мой персональный сайт " +
                "— https://www.skillbox.ru/\nЕсли возникнут вопросы, пишите мне напрямую. Я всегда доступен";
        System.out.println("Текст который нам дан:");
        System.out.println(text1);
        System.out.println("Попытаемся найти в нем ссылки с помощью регулярного выражения...");
        String regexSite = "https://[^,\\s]+";
//        [^,\\s]+ - означает любые символы, кроме запятой и пробела(пробел, перенос строки, символ табуляции и ещё некоторые варианты пробельных символов)
//        «Крышечка» — ^ — в начале набора символов (внутри квадратных скобок) означает отрицание этого набора.
//                         То есть это обратный набор — все символы, кроме входящих в этот набор — все символы, кроме пробела и запятой.
//        Символ плюса после символа, в том числе после набора символов, означает, что эти символы,
//        которые «не запятая» и «не пробельный символ», могут встречаться один или более раз.
        Pattern pattern = Pattern.compile(regexSite);
        Matcher matcher = pattern.matcher(text1);
        /*while (matcher.find()) {
            int start = matcher.start();;
            int end = matcher.end();
            System.out.println(text1.substring(start, end));
        }*/

//        Второй вариант написания нахождения подсторок
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 6:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Маски в регулярных выражениях" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "необходимо извлечь из текста ниже все цитаты — фрагменты в кавычках: " + ANSI_RESET);
        String text2 = "Дмитрий сообщил следующее: «Я вернусь в 12:40 и, будьте добры, подготовьте " +
                "к этому времени все документы!» На что Анна ему ответила: «А документы-то так и не привезли». " +
                "Дмитрий удивлённо посмотрел на неё и сказал: «Ну и ладно», — вздохнул, махнул рукой и удалился.";
        System.out.println(text2);
//        У нас следующее вырожение чтобы найти цитату, где:
//        String regexMask = "«[^»]+»";
//        в начале стоит открывающая кавычка, потом множество символов, кроме закрывающей кавычки, а потом — закрывающая кавычка
//        но чтобы кавычек тоже не было, делаем со скобочками:
        String regexMask = "«([^»]+)»";
//       matcher.group(1) - вернёт содержимое без кавычек, matcher.group(0) - вернет с кавычками, 2 - хз не работает;
        Pattern pattern1 = Pattern.compile(regexMask);
        Matcher matcher1 = pattern1.matcher(text2);
        while (matcher1.find()) {
            String citation = matcher1.group(0);
            System.out.println(citation);
        }

        System.out.println();
        System.out.println();
        System.out.println(ANSI_PURPLE + "Элементы синтаксиса регулярных выражений: ");
        System.out.println("Выражение\t-\tОписание");
        System.out.println("[abc]\t-\tНабор символов. Данное выражение соответствует любому символу из перечисленных в квадратных скобках. " +
                        "Например, регулярное выражение [13579] будет соответствовать символу, являющемуся нечётным числом.");
        System.out.println("[^abc]\t-\tОтрицание набора символов. Данное выражение соответствует любому символу, кроме перечисленных в квадратных скобках. " +
                "Символ-«крышечка» — ^ — не входит в этот набор и обозначает отрицание набора.\n" +
                "\t\tНапример, регулярное выражение [^xyz] будет соответствовать любому символу, кроме букв x, y и z.");
        System.out.println("[0-9]\t-\tДиапазон символов. Дефис означает, что в набор символов входят все цифры от 0 до 9. " +
                "Например, регулярное выражение [a-z] будет соответствовать любой строчной латинской букве.");
        System.out.println("\\\\s\t-\tПробельный символ — пробел, символ переноса строки, символ табуляции или иной пробельный символ.");
        System.out.println("n+\t-\tОдин или несколько символов n. Например, регулярное выражение [0-9]+ будет соответствовать всем числам, независимо от того, " +
                "состоят ли они из одной или нескольких цифр. При этом, если в числе есть точка, запятая или хотя бы один пробел, " +
                "оно не будет соответствовать такому выражению.");
        System.out.println("n*\t-\tНоль, один или несколько символов n. Например, регулярное выражение [A-Z][a-zA-Z]* " +
                "будет соответствовать как просто отдельным прописным буквам, так и всем прописным буквам, " +
                "после которых идут прописные или строчные буквы в любом количестве, например:\n" +
                "\t\tA \n" +
                "\t\tAn \n" +
                "\t\tArticle \n" +
                "\t\tANTICS");
        System.out.println("n?\t-\tНоль или один символ n. Например, регулярное выражение https?:// " +
                "будет соответствовать как строкам http://, так и строкам https://, поскольку после буквы s стоит вопросительный знак, " +
                "означающий, что буква s может присутствовать или отсутствовать.");
        System.out.println("n{5}\t-\tСимвол n, встречающийся пять раз. Например, выражение [1-9][0-9]{3} будет соответствовать всем числам, " +
                "состоящим из четырёх цифр, и начинающихся с цифр от 1 до 9.");
        System.out.println("n{5,}\t-\t\"Символ n, встречающийся пять и более раз. Например, регулярное выражение [A-Z]{2,} " +
                "будет соответствовать всем строкам, состоящим из двух и более прописных букв.");
        System.out.println("n{5,8}\t-\tСимвол n, встречающийся пять-восемь раз. Например, регулярное выражение:\n" +
                "\t\t[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3} \n" +
                "\t\tбудет соответствовать всем IP-адресам стандарта IPv4, которые имеют такой вид:\n" +
                "\t\t192.168.0.1\n" +
                "\t\t0.0.0.0\n" +
                "\t\t255.255.255.0\n" +
                "\t\tПри этом важно, что каждое число в таких адресах может быть в диапазоне от 0 до 255, и проверить это при помощи регулярных выражений сложнее.");
        System.out.println(".\t-\tодиночный символ");
        System.out.println("^\t-\tначало строки");
        System.out.println("$\t-\tконец строки");
        System.out.println("\\\t-\tэкранирование");
        System.out.println("\\d\t-\tлюбая цифра");
        System.out.println("\\D\t-\tвсе, кроме цифр");
        System.out.println("\\S\t-\tвсе, кроме пробелов");
        System.out.println("\\w\t-\tбуква");
        System.out.println("\\w\t-\tвсе, кроме букв");
        System.out.println("\\\t-\tэкранирование");
        System.out.println(ANSI_RESET);

    }

    public static String formatPhoneNumber(String phone) {
        return phone.replaceAll(REGEX, "");
    }

    public static void lesson6() {
        System.out.println(ANSI_CYAN + "Lesson 5" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "String Pool" + ANSI_RESET);
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 1:" + ANSI_RESET);
        String name1 = "Алексей";
        String name2 = "Алексей";
        System.out.println("#1");
        System.out.println(name1 == name2);

        String name3 = "Алексей";
        String name4 = new String("Алексей");
        System.out.println("#2");
        System.out.println(name3 == name4);

        String name5 = "Алексей";
//        Если строка есть в пуле, тогда она будет хранить ту самую строку
        String name6 = new String("Алексей").intern();
        System.out.println("#3");
        System.out.println(name5 == name6);
        name5 += 1;
        System.out.println(name5 == name6);

    }

    public static void lesson5() {
        System.out.println(ANSI_CYAN + "Lesson 5" + ANSI_RESET);
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 1:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Работа с подстроками:" + ANSI_RESET);

        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";

        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println("header1 - " + getEncoding(header1));
        System.out.println("header2 - " + getEncoding(header2));
        System.out.println("header3 - " + getEncoding(header3));

        System.out.println("header4 - " + getEncoding(header4));
        System.out.println("header5 - " + getEncoding(header5));
        System.out.println("header6 - " + getEncoding(header6));
        System.out.println();


        System.out.println("\t" + ANSI_YELLOW + "Task 2:" + ANSI_RESET);

        System.out.println(ANSI_GREEN + "Работа с StringJoiner(\", \"):" + ANSI_RESET);
        String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексей";

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner);

        System.out.println(ANSI_GREEN + "Работа с String.join(\", \", ...):" + ANSI_RESET);
        String list = String.join(", ", name1, name2, name3);
        System.out.println(list);

        System.out.println();


        System.out.println("\t" + ANSI_YELLOW + "Task 3:" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Форматирование строк:" + ANSI_RESET);
        String name = "Максим";
        int birthday = 1986;
//        {"name": "Максим", "birthday": "1986"}
//        String result = "{\"name\": \"" + name + "\", \"birthday\": \"" + birthday +"\"}";
        String template = "{\"name\": \"%s\", \"birthday\": \"%d\"}"; // где %s - это строка, а %d - число
        String result = String.format(template, name, birthday);
        System.out.println(result);
        System.out.printf(template, name, birthday);
        System.out.println();

        System.out.println();

        System.out.println(ANSI_PURPLE + "Список обозначений для форматирования:");
        System.out.println("\t%s - строка(String)");
        System.out.println("\t%d - целое число");
        System.out.println("\t%f - число double или float");
        System.out.println("\t%b - boolean");
        System.out.println("\t%n - перенос строки");
        System.out.println("\t%t - дата (Date))");
        System.out.println("\t%% - символ процента" + ANSI_RESET);

    }

    public static String getEncoding(String header) {
        String charset = "charset=";
        int start = header.indexOf(charset);
        int end = header.indexOf(';', start);
        if (start < 0 || end < 0) {
            return "";
        }
//        Возвращает подстроку начиная от start(включительно) до end(не включительно)
        String encoding = header.substring(start + charset.length(), end);
        return encoding;
    }

    public static void lesson4() {
        System.out.println(ANSI_CYAN + "Lesson 4" + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_GREEN + "Перебор символов в строке:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 1:" + ANSI_RESET);
        String hello = "Hello";
        System.out.println("String = " + hello);
        char[] chars = hello.toCharArray();
        System.out.println("Первая буква: " + chars[0]);
        System.out.println();

        System.out.println("\t" + ANSI_YELLOW + "Task 2:" + ANSI_RESET);
        String str = "Это тестовая строка для подсчета пробелов";
        System.out.println("String = " + str);
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);
        System.out.println();

        System.out.println(ANSI_GREEN + "Работа с пробелами по краям строки:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 3:" + ANSI_RESET);
        String text = "  Some spaces at the start and at the end   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .trim()...");
        String clearedText = text.trim();
        System.out.println("Полученный текст :{" + clearedText + "}");
        text = "  Some spaces at the \nstart and at the \tend   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .trim()...");
        clearedText = text.trim();
        System.out.println("Полученный текст :{" + clearedText + "}");
        text = "  Some spaces at the \nstart and at the \tend   ";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Используем метод .strip()...");
        clearedText = text.strip();
        System.out.println("Полученный текст :{" + clearedText + "}");
        System.out.println(ANSI_RED + "!Как получить пробел другой кодировки - пока хз..." + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_GREEN + "Методы isDigit и isLetter:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 4:" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Проверяем, является ли символ числом:" + ANSI_RESET);
        text = "1990 year";
        System.out.println("Исходный текст :{" + text + "}");
        System.out.println("Проверяем первый символ: ");
        if(Character.isDigit(text.charAt(0))) {
            System.out.println("This is digit");
        } else {
            System.out.println("This is not digit");
        }
        System.out.println("Проверяем 7 символ буква ли он: ");
        if(Character.isLetter(text.charAt(6))) {
            System.out.println("This is letter");
        } else {
            System.out.println("This is not letter");
        }
        System.out.println("Проверяем 7 символ иероглиф ли он: ");
        if(Character.isIdeographic(text.charAt(6))) {
            System.out.println("This is ideographic");
        } else {
            System.out.println("This is not ideographic");
        }
        System.out.println("Проверяем первый символ - является ли переданный символ допустимым при именовании переменных и методов в Java: ");
        if(Character.isJavaLetterOrDigit(text.charAt(0))) {
            System.out.println("Является");
        } else {
            System.out.println("Не является");
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Кодировки в Java:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 5:" + ANSI_RESET);
        System.out.print("Узнаем дефолтную кодировку через java.nio.charset.Charset: " );
        System.out.println(Charset.defaultCharset());
        System.out.println(ANSI_BLUE + "Также класс Charset используется для задания кодировки текста. " +
                "Чтобы узнать коды символов в данной кодировке, используем метод getBytes класса String:" + ANSI_RESET);
        text = "Привет";
        System.out.println("Кодировка: " + StandardCharsets.UTF_8);
        byte[] textBytes = text.getBytes(StandardCharsets.UTF_8);
        for (byte textByte: textBytes) {
            System.out.print(textByte + " ");
        }
        System.out.println();
        System.out.println("Кодировка: Windows-1251");
        try {
            textBytes = text.getBytes("Windows-1251");
            for (byte textByte: textBytes) {
                System.out.print(textByte + " ");
            }
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.println(ANSI_RED + "Упс... Ошибочка" + ANSI_RESET);
        }
        System.out.println();

        System.out.println(ANSI_GREEN + "Как сменить кодировку текста:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 6:" + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_GREEN + "Методы isDigit и isLetter:" + ANSI_RESET);
        System.out.println("\t" + ANSI_YELLOW + "Task 7:" + ANSI_RESET);
        String newText = "Hello всем!";
        System.out.println("Исходная строчка: {" + newText + "}");
        String encoded = new String(newText.getBytes(), StandardCharsets.US_ASCII);
        System.out.println("Полученная строчка: {" + encoded + "}");
        System.out.println();
    }

    public static void lesson3() {
        System.out.println(ANSI_CYAN + "Lesson 3" + ANSI_RESET);
        System.out.println();

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
        System.out.println(ANSI_CYAN + "Lesson 2" + ANSI_RESET);
        System.out.println();

        String name = "Анастасия";
        String surname = "Басова";
        LocalDate birthday = LocalDate.of(1994, 1, 31);

        String personInfo = name + " " + surname + " - " + birthday;
        System.out.println(personInfo);
    }
}
