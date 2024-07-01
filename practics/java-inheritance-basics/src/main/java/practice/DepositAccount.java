package practice;

import java.time.Duration;
import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }

    @Override
    public void take(double amountToTake) {
        LocalDate now = LocalDate.now();
        long days = Duration.between(lastIncome.atStartOfDay(), now.atStartOfDay()).toDays();
        if (days < 31) {
            return;
        }
        super.take(amountToTake);
    }
}
