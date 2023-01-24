public class StringBetternessAssessor {

    public static String betterString(String x, String y, TwoStringPredicate f) {
        if (f.better(x, y))
            return x;
        return y;
    }

}
