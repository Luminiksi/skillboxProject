package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    private TreeSet set = new TreeSet();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        if (!email.contains("@") || !email.contains(".")) {
            return;
        }
        set.add(email.toLowerCase());
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(set);
    }

}
