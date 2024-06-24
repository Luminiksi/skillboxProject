package practice;

import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook book = new PhoneBook();
        while (true) {
            System.out.println("Введите номер, имя или команду:");
            String name = scanner.nextLine();

            if (name.equals("LIST")) {
                Set<String> members = book.getAllContacts();
                if (members.isEmpty()) {
                    System.out.println("Пока телефонная книга пуста . . .");
                    continue;
                }
                for (String member : members) {
                    System.out.println(member);
                }
                continue;
            }

            String phone = PhoneBook.getValidNumber(name);
            if (phone != null) {
                String create = book.getContactByPhone(phone);
                if (!create.isBlank()) {
                    System.out.println(create);
                    continue;
                }
                System.out.println("Такого номера нет в телефонной книге.");
                System.out.println("Введите имя абонента для номера “" + phone + "”:");
                name = scanner.nextLine();
                book.addContact(phone, name);
            } else {
                if (!book.isValidName(name)) {
                    System.out.println("Неверный формат ввода");
                    continue;
                }
                Set<String> create = book.getContactByName(name);
                if (!create.isEmpty()) {
                    for (String memberInfo : create) {
                        System.out.println(memberInfo);
                    }
                    continue;
                }
                System.out.println("Такого имени в телефонной книге нет.");
                System.out.println("Введите номер телефона для абонента “" + name + "”:");
                phone = scanner.nextLine();
                book.addContact(phone, name);
            }
        }

    }
}
