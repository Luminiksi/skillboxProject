package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */
    public static final String FIND_NUMBER = "A111BC197";
    public static final String NOT_FIND_NUMBER = "У777HC66";

    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        List<String> list = CoolNumbers.generateCoolNumbers();
        long timeEnd = System.nanoTime();
        CoolNumbers.printNumbers(list);
        long time = timeEnd - timeStart;
        System.out.println("Генерация списка составила - " + time + "нс");
        CoolNumbers.initSearch(list, FIND_NUMBER, NOT_FIND_NUMBER);
        System.out.println();
        checkSearchInList(list);
        System.out.println();
        checkBinarySearch(list);
        System.out.println();
        checkSearchInHashSet(list);
        System.out.println();
        checkSearchInTreeSet(list);
        System.out.println();

    }

    public static void checkSearchInList(List<String> list) {
        long timeStart = System.nanoTime();
        boolean result = CoolNumbers.bruteForceSearchInList(list, FIND_NUMBER);
        long timeEnd = System.nanoTime();
        long time = timeEnd - timeStart;
        printResult("Поиск перебором", result, time);

        timeStart = System.nanoTime();
        result = CoolNumbers.bruteForceSearchInList(list, NOT_FIND_NUMBER);
        timeEnd = System.nanoTime();
        time = timeEnd - timeStart;
        printResult("Поиск перебором", result, time);

    }
    public static void checkBinarySearch(List<String> list) {
        Collections.sort(list);
        long timeStart = System.nanoTime();
        boolean result = CoolNumbers.binarySearchInList(list, FIND_NUMBER);
        long timeEnd = System.nanoTime();
        long time = timeEnd - timeStart;
        printResult("Бинарный поиск", result, time);

        timeStart = System.nanoTime();
        result = CoolNumbers.binarySearchInList(list, NOT_FIND_NUMBER);
        timeEnd = System.nanoTime();
        time = timeEnd - timeStart;
        printResult("Бинарный поиск", result, time);

    }
    public static void checkSearchInHashSet(List<String> list) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        long timeStart = System.nanoTime();
        boolean result = CoolNumbers.searchInHashSet(hashSet, FIND_NUMBER);
        long timeEnd = System.nanoTime();
        long time = timeEnd - timeStart;
        printResult("Поиск в HashSet", result, time);

        timeStart = System.nanoTime();
        result = CoolNumbers.searchInHashSet(hashSet, NOT_FIND_NUMBER);
        timeEnd = System.nanoTime();
        time = timeEnd - timeStart;
        printResult("Поиск в HashSet", result, time);
    }
    public static void checkSearchInTreeSet(List<String> list) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(list);
        long timeStart = System.nanoTime();
        boolean result = CoolNumbers.searchInTreeSet(treeSet, FIND_NUMBER);
        long timeEnd = System.nanoTime();
        long time = timeEnd - timeStart;
        printResult("Поиск в TreeSet", result, time);

        timeStart = System.nanoTime();
        result = CoolNumbers.searchInTreeSet(treeSet, NOT_FIND_NUMBER);
        timeEnd = System.nanoTime();
        time = timeEnd - timeStart;
        printResult("Поиск в TreeSet", result, time);
    }

    public static void printResult(String searchName, boolean result, long time) {
        System.out.println(searchName + ": номер " + (result ? "найден" : "не найден")
                + ", поиск занял " + time + "нс");
    }
}
