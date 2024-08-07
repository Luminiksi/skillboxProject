package practics.part_14.homeTasks;

public class Operator implements Employee {
    private static final double SALARY = 30_000;
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        return SALARY;
    }
}
