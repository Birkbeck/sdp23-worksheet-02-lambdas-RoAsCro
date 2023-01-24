@FunctionalInterface
public interface TwoElementPredicate<T> {
    public boolean better(T x, T y);
}
