package practice;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook book = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String name = scanner.nextLine();

            if (name.equals("LIST")) {
                getList(book);
                continue;
            }

            String phone = PhoneBook.getValidNumber(name);
            if (phone != null) {
                addByPhone(book, name, phone);
            } else {
                addByName(book, name);
            }
        }
    }


    public static void getList(PhoneBook book) {
        Set<String> members = book.getAllContacts();
        if (members.isEmpty()) {
            System.out.println("Пока телефонная книга пуста . . .");
            return;
        }
        for (String member : members) {
            System.out.println(member);
        }
    }

    public static void addByPhone(PhoneBook book, String name, String phone) {
        String create = book.getContactByPhone(phone);
        if (!create.isBlank()) {
            System.out.println(create);
            return;
        }
        System.out.println("Такого номера нет в телефонной книге.");
        System.out.println("Введите имя абонента для номера “" + phone + "”:");
        name = scanner.nextLine();
        book.addContact(phone, name);
    }

    public static void addByName(PhoneBook book, String name) {
        if (!book.isValidName(name)) {
            System.out.println("Неверный формат ввода");
            return;
        }
        Set<String> create = book.getContactByName(name);
        if (!create.isEmpty()) {
            for (String memberInfo : create) {
                System.out.println(memberInfo);
            }
            return;
        }
        System.out.println("Такого имени в телефонной книге нет.");
        System.out.println("Введите номер телефона для абонента “" + name + "”:");
        String phone = scanner.nextLine();
        book.addContact(phone, name);
    }
}
