package practice;

import java.util.*;

public class CoolNumbers {
    public final static char[] LETTERS = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    public static List<String> generateCoolNumbers() {
        HashSet<String> numbers = new HashSet<>();
        while (numbers.size() < 2_000_000) {
            numbers.add(generateNumber());
        }
        ArrayList<String> result = new ArrayList<>();
        result.addAll(numbers);
        return result;
    }

    private static String generateNumber() {
        String number = "";
        int index = (int) (Math.random() * LETTERS.length);
        number += LETTERS[index];

        index = (int) (Math.random() * 999);
        String numb = String.valueOf(index);
        if (numb.length() == 2) {
            number += "0" + numb;
        } else if (numb.length() == 3) {
            number += numb;
        } else {
            number += "00" + numb;
        }

        index = (int) (Math.random() * LETTERS.length);
        number += LETTERS[index];
        index = (int) (Math.random() * LETTERS.length);
        number += LETTERS[index];

        index = (int) (Math.random() * 198) + 1;
        numb = String.valueOf(index);
        if (numb.length() == 1) {
            number += "0" + numb;
        } else {
            number += index;
        }

        return number;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        if (number == null) {
            return false;
        }
        for (String atr : list) {
            if (number.equals(atr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
//        Подразумеваем, что список уже отсортирован
        if (number == null) {
            return false;
        }
        int index = Collections.binarySearch(sortedList, number);
        return index >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

    public static void printNumbers(List<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void initSearch(List<String> list, String addString, String removeString) {
        if (addString == null || removeString == null || addString.equals(removeString) || list.isEmpty()) {
            return;
        }
        list.remove(removeString);
        int index = Collections.binarySearch(list, addString);
        if (index < 0) {
            list.add(-index - 1, addString);
        }
    }

}
