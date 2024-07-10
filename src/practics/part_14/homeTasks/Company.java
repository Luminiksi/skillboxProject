package practics.part_14.homeTasks;

import java.util.*;

public class Company {
    private List<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        this.employees.addAll(employes);

    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }

    public int getIncome() {
        int income = 0;
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                income += ((Manager) employee).getMonthSale();
            }
        }
        return income;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        /*
        Сначала написла так:
        Collections.sort(employes, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
            }
        });
        но new Comparator<Employee>() - выделено серым, и идея подсказала такой синтаксис:
         */
        Collections.sort(employees, Comparator.comparingDouble(Employee::getMonthSalary));
        return employees.subList(0, count);

    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees, (o1, o2) -> -Double.compare(o1.getMonthSalary(), o2.getMonthSalary()));
        return employees.subList(0, count);
    }

    public void printEmployees() {
        for (Employee employee :
                employees) {
            System.out.println(employee.getClass() + " - " + employee.getMonthSalary());
        }
    }
}
