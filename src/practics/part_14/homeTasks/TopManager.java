package practics.part_14.homeTasks;

public class TopManager implements Employee {
    private static final double SALARY = 100_000;
    private static final double BONUS = 1.5;
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    public double getMonthSalary() {
        double monthSalary = SALARY;
        if (company.getIncome() > 10_000_000) {
            monthSalary += SALARY * BONUS;
        }
        return monthSalary;
    }
}
