package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        scanner.close();
        break;
      }

      // TODO:напишите ваш код тут, результат вывести в консоль.
      System.out.println(formatPhoneNumber(input));
    }
  }
  public static String formatPhoneNumber(String phone) {
    String regex = "[^0-9]";
    String newString = phone.replaceAll(regex, "");
    if (newString.length() == 10) {
      newString = 7 + newString;
    } else if (newString.length() != 11) {
      return "Неверный формат номера";
    }
    if (newString.charAt(0) == '8') {
      newString = newString.replace('8', '7');
    } else if (newString.charAt(0) != '7') {
      return "Неверный формат номера";
    }
    return newString;
  }

}
