public class ElementBetternessAssessor {

    public static <T> T betterElement(T x, T y, TwoElementPredicate<T> f) {
        if (f.better(x, y))
            return x;
        else return y;
    }
}
