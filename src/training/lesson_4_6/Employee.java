package training.lesson_4_6;

public class Employee {
    private String name;
    private String email = "не задан";
    private int number = 0;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Employee(String name, String email, int number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + number);
    }

}
