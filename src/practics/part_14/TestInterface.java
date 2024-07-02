package practics.part_14;

public interface TestInterface {
    // обычный метод интерфейса
    void regularMethod();

    default void defaultMethod() {
        // метод интерфейса с дефолтной реализацией
    }
}
