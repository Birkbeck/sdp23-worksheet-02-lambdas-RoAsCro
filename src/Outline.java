import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));

    //1
    String[] stringArray = {"a", "aba", "d", "hifja", "fe", "kef"};
    System.out.println("aa".compareTo("b"));
    Arrays.sort(stringArray, (o1, o2) -> o1.length() - o2.length());
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, (o1, o2) -> o2.length() - o1.length());
    System.out.println(Arrays.asList(stringArray));


    String[] stringArray2 = {"ada", "a", "ab", "hiefja", "fe", "kef"};
    Arrays.sort(stringArray2, (o1, o2) -> o1.charAt(0) - o2.charAt(0));
    System.out.println(Arrays.asList(stringArray2));

    Arrays.sort(stringArray2, (o1, o2) -> o1.contains("e") && !o2.contains("e") ? -1 : !o1.contains("e") && o2.contains("e") ? 1 : 0);
    System.out.println(Arrays.asList(stringArray2));

    //2

    String[] stringArray3 = {"ada", "ae", "ragg", "ab", "hiefja", "fe", "kef"};
    Arrays.sort(stringArray3, Outline::eChecker);
    System.out.println(Arrays.asList(stringArray3));

    //3
    System.out.println(StringBetternessAssessor.betterString("dog", "cat", (x, y) -> true));
    System.out.println(StringBetternessAssessor.betterString("dog", "cat", (x, y) -> false));

    // Arrays.sort(intArray,.......)
  }

  public static int eChecker(String x, String y) {
    boolean xCheck = x.contains("e");
    boolean yCheck = y.contains("e");
    if (xCheck && !yCheck)
      return -1;
    if (!xCheck && yCheck)
      return 1;
    return 0;
  }

}
