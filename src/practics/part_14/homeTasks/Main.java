package practics.part_14.homeTasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static final int OPERATOR_COUNT = 180;
    public static final int MANAGER_COUNT = 80;
    public static final int TOP_MANAGER_COUNT = 10;
    public static final double DISMISSAL_RATIO = 0.5;


    public static void main(String[] args) {
        Company company = initCompany();

        /*company.printEmployees();*/
        System.out.println(company.getIncome());
        checkSalary(company);

        dismissal(company);
        /*company.printEmployees();*/
        System.out.println(company.getIncome());
        checkSalary(company);

    }

    public static Company initCompany() {
        Company company = new Company();
        List<Employee> operators = new ArrayList<>();
        for (int i = 0; i < OPERATOR_COUNT; i++) {
            operators.add(new Operator(company));
        }
        company.hireAll(operators);
        List<Employee> managers = new ArrayList<>();
        for (int i = 0; i < MANAGER_COUNT; i++) {
            managers.add(new Manager(company));
        }
        company.hireAll(managers);
        for (int i = 0; i < TOP_MANAGER_COUNT; i++) {
            company.hire(new TopManager(company));
        }

        return company;
    }

    public static void dismissal(Company company) {
        int operatorDis = (int) (OPERATOR_COUNT * DISMISSAL_RATIO);
        int managerDis = (int) (MANAGER_COUNT * DISMISSAL_RATIO);
        int topManagerDis = (int) (TOP_MANAGER_COUNT * DISMISSAL_RATIO);

        Iterator iterator = company.getEmployees().iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if (employee instanceof Operator && operatorDis != 0) {
                iterator.remove();
                operatorDis--;
            } else if (employee instanceof Manager && managerDis != 0) {
                iterator.remove();
                managerDis--;
            } else if (employee instanceof TopManager && topManagerDis != 0) {
                iterator.remove();
                topManagerDis--;
            }
            if (operatorDis == 0 && managerDis == 0 && topManagerDis == 0) {
                break;
            }
        }
    }

    public static void checkSalary(Company company) {
        List<Employee> topSalary = company.getTopSalaryStaff(15);
        System.out.println("Топ самых больших зарплат");
        printEmployee(topSalary);
        System.out.println("Топ самых низких зарплат");
        List<Employee> lowestSalary = company.getLowestSalaryStaff(30);
        printEmployee(lowestSalary);
    }

    public static void printEmployee(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getMonthSalary());
        }
    }
}
