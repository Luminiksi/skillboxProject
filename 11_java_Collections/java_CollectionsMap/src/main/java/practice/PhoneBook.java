package practice;

import java.util.*;

public class PhoneBook {
    public static final String REGEX_NUMBERS = "[0-9]{10,11}";
    public static final String REGEX_NAMES = "[a-z,A-Z,а-я,А-Я,ё,Ё,\\s]";
    public static final String NOT_REGEX = "[^0-9]";
    private HashMap<String, String> phonesBook = new HashMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        phone = getValidNumber(phone);
        if (phone == null || name == null || name.isBlank() || !isValidName(name)) {
            System.out.println("Неверный формат ввода");
            return;
        }
        phonesBook.put(phone, name);
        System.out.println("Контакт сохранен!");
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        if (isAlreadyCreatePhone(phone)) {
            String name = phonesBook.get(phone);
            return name + " - " + phone;
        }
        return "";
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        HashSet<String> phones = new HashSet<>();
        if (!isAlreadyCreateName(name)) {
            return new TreeSet<>();
        }
        for (Map.Entry entry : phonesBook.entrySet()) {
            if (entry.getValue().equals(name)) {
                phones.add(entry.getValue() + " - " + entry.getKey());
            }
        }
        return phones;
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> contacts = new TreeSet<>();
        for (Map.Entry entry : phonesBook.entrySet()) {
            String name = entry.getValue() + " - ";
            String contact = getContactFromSet(contacts, name);
            if (contact != null) {
                contacts.remove(contact);
                contacts.add(contact + ", " + entry.getKey());
            } else {
                contacts.add(entry.getValue() + " - " + entry.getKey());
            }
        }

        return contacts;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */

    private String getContactFromSet(Set<String> set, String name) {
        for (String element : set) {
            if (element.startsWith(name)) {
                return element;
            }
        }
        return null;
    }

    public boolean isAlreadyCreateName(String name) {
        if (phonesBook.containsValue(name)) {
            return true;
        }
        return false;
    }

    public boolean isAlreadyCreatePhone(String phone) {
        if (phonesBook.containsKey(phone)) {
            return true;
        }
        return false;
    }

    public static String getValidNumber(String string) {
        String phone = string.replaceAll(NOT_REGEX, "");
        if (!phone.matches(REGEX_NUMBERS)) {
            return null;
        }
        if (phone.length() == 10) {
            phone = "7" + phone;
        } else if (phone.startsWith("8")) {
            phone = "7" + phone.substring(1);
            System.out.println(phone);
        }
        return phone;
    }

    public static boolean isValidName(String string) {
        String name = string.replaceAll(REGEX_NAMES, "");
        if (name.isBlank()) {
            return true;
        }
        return false;
    }
}