package streamAPI;

import java.time.LocalDate;

public class Employee {
    private int savary;
    private LocalDate hiringDate;

    public Employee(int savary, LocalDate hiringDate) {
        this.savary = savary;
        this.hiringDate = hiringDate;
    }

    public int getSavary() {
        return savary;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }
}
