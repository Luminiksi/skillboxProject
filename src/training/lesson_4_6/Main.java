package training.lesson_4_6;

public class Main {
    public static void main(String[] args) {
        User nastya = new User("Настя", 30);
        User dima = new User("Дима", 31);
        User lena = new User("Лена", 31);
        printUserInfo(nastya);
        printUserInfo(dima);
        printUserInfo(lena);
    }

    public static void printUserInfo(User user) {
        System.out.println("Пользователь: " + user.getName() + ", " + user.getAge() + " лет");
    }
}
