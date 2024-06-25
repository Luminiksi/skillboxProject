package collectionsUsage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        lesson5();
    }

    public static void lesson5() {
        System.out.println("Lesson 4");
        lesson5Task1();
        System.out.println();
        lesson5Task2();
        System.out.println();
    }

    public static void lesson5Task1() {
        System.out.println("Lesson 5 -> Task 1");

        Game game = new Game();
        game.initPlayers();
        ArrayList<String> winners = game.getWinners();
        printList(winners);
        System.out.println();
    }

    public static void lesson5Task2() {
        System.out.println("Lesson 5 -> Task 1");

        Game game = new Game();
        game.initPlayers();
        game.printList();
        System.out.println();
        game.add("Андрей Дмитриев");
        System.out.println("После добавления получаем:");
        game.printList();

        System.out.println();
    }

    public static void lesson4() {
        System.out.println("Lesson 4");
        lesson4Task1();
        System.out.println();

    }

    public static void lesson4Task1() {
        System.out.println("Lesson 4 -> Task 1");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Красный");
        colors.add("Зеленый");
        colors.add("Синий");
        colors.add("Желтый");

        System.out.println("исходный  list:");
        printList(colors);
        System.out.println();

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
            if(color.equals("Зеленый")) {
                System.out.println("DELETE!");
                iterator.remove();
            }
        }
        System.out.println("Итого:");
        printList(colors);
    }

    public static void lesson3() {
        System.out.println("Lesson 3");
        lesson3Task1();
        System.out.println();
        lesson3Task2();
        System.out.println();
    }

    public static void lesson3Task1() {
        System.out.println("Lesson 3 -> Task 1");

        String[] colors = {"Красный", "Синий", "Зеленый", "Желтый"};
        System.out.println("\tДобавление первым способом(с помощью цикла)");
        ArrayList<String> colorList = new ArrayList<>();
        for (String color : colors) {
            colorList.add(color);
        }
        printList(colorList);
        System.out.println();

        System.out.println("\tДобавление вторым способом(с помощью метода addAll)");
        colorList = new ArrayList<>();
        colorList.addAll(Arrays.asList(colors));
        printList(colorList);

        String[] newColors = new String[colorList.size()];
        for (int i = 0; i < newColors.length; i++) {
            newColors[i] = colorList.get(i);
        }
        System.out.println("-----");
        System.out.println(Arrays.toString(newColors));
        System.out.println();

        System.out.println("\tДобавление третьим способом(с помощью конструктора)");
        colorList = new ArrayList<>(Arrays.asList(colors));
        printList(colorList);
        System.out.println();

        System.out.println("\tРабота с HashSet:");
        HashSet<String> colorSet = new HashSet<>(colorList);
        printSet(colorSet);
        System.out.println();

        System.out.println("\tРабота с TreeSet:");
        TreeSet<String> colorsTreeSet = new TreeSet<>(colorList);
        printSet(colorsTreeSet);
        System.out.println();

        System.out.println("\tРабота с TreeSet(добавили компаратор):");
        colorsTreeSet = new TreeSet<>(new ColorComparator());
        colorsTreeSet.addAll(colorList);
        printSet(colorsTreeSet);

        System.out.println();
    }

    public static void lesson3Task2() {
        System.out.println("Lesson 3 -> Task 2");

        System.out.println("Заданный HashMap");
        HashMap<String, Integer> basket = new HashMap<>();
        basket.put("Молоко", 20);
        basket.put("Масло", 10);
        basket.put("Хлеб", 5);
        printMap(basket);
        System.out.println();

        System.out.println("Преобразование HashMap в TreeMap");
        TreeMap<String, Integer> basketMap = new TreeMap<>(basket);
        printMap(basketMap);
        System.out.println();

        System.out.println("Преобразование HashMap в TreeMap(с компаратором)");
        basketMap = new TreeMap<>(new ProductComparator());
        basketMap.putAll(basket);
        printMap(basketMap);

        System.out.println();
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void printSet(Set<String> set) {
        for (String obj :
                set) {
            System.out.println(obj);
        }
    }

    public static void printList(ArrayList<String> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
