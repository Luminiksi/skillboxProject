package functionalProgramming;

@FunctionalInterface
public interface Action<T extends Number> {
    T calculate(T t1, T t2);
}
