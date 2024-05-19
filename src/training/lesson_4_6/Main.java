package training.lesson_4_6;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Сотрудник Один", "new@mail.com");
        Employee employee2 = new Employee("Сотрудник Два", 4312);
        Employee employee3 = new Employee("Сотрудник Три", "new2@mail.com", 2342);
        employee1.printInfo();
        employee2.printInfo();
        employee3.printInfo();
    }

    public static void printUserInfo(User user) {
        System.out.println("Пользователь: " + user.getName() + ", " + user.getAge() + " лет");
    }
}
