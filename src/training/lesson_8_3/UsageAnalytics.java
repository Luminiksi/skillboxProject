package training.lesson_8_3;

public class UsageAnalytics {
    private int visitCount;

    public UsageAnalytics() {
        visitCount = 0;
    }

    public int countVisit() {
        return ++visitCount;
    }
}
