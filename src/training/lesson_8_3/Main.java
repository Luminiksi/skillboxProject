package training.lesson_8_3;

public class Main {
    public static void main(String[] args) {
        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Всего посещений: " + visits);
    }
}
