package practics.part_14.homeTasks;

public class Manager implements Employee {
    private static final double SALARY = 70_000;
    private static final double BONUS = 0.05;
    private int sale;
    private Company company;

    public Manager(Company company) {
        this.company = company;
        sale = (int) (Math.random() * 115_000) + 25_000;
    }

    @Override
    public double getMonthSalary() {
        return SALARY + (SALARY * BONUS);
    }

    public int getMonthSale() {
        return sale;
    }
}
