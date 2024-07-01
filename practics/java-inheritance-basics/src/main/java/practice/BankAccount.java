package practice;

public class BankAccount {
  protected double amoint;

  public double getAmount() {
    //TODO: реализуйте метод и удалите todo
    // верните значение количества денег не счету
    return amoint;
  }

  public void put(double amountToPut) {
    //TODO: реализуйте метод и удалите todo
    // метод зачисляет деньги на счет
    if (amountToPut < 0) {
      return;
    }
    amoint += amountToPut;
  }

  public void take(double amountToTake) {
    //TODO: реализуйте метод и удалите todo
    // метод списывает деньги со счета
    if (amoint < amountToTake) {
      return;
    }
    amoint -= amountToTake;
  }
}
