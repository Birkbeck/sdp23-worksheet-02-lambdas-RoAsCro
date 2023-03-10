import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

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

    //4
    System.out.println(ElementBetternessAssessor.betterElement("dog", "cat", (x, y) -> true));
    System.out.println(ElementBetternessAssessor.betterElement("dog", "cat", (x, y) -> false));

    //5&6
    String[] stringArray4 = {"a", "dsad", "f", "wr3", "wabwdfafwf"};
    List<String> shortWords = allMatches(Arrays.asList(stringArray4), s -> s.length() < 4);
    System.out.println(shortWords);
    List<String> wordsWithB = allMatches(Arrays.asList(stringArray4), s -> s.contains("b"));
    System.out.println(wordsWithB);
    List<String> evenLengthWords = allMatches(Arrays.asList(stringArray4), s -> (s.length() % 2) == 0);
    System.out.println(evenLengthWords);

    //7&8
    String[] stringArray5 = {"a", "dsaid", "f", "wr3", "wabwdfafwf"};
    List<String> excitingWords = transformedList(Arrays.asList(stringArray5), s -> s + "!");
    System.out.println(excitingWords);
    List<String> eyeWords = transformedList(Arrays.asList(stringArray5), s -> s.replace("i", "eye"));
    System.out.println(eyeWords);
    List<String> upperCaseWords = transformedList(Arrays.asList(stringArray5), String::toUpperCase);
    System.out.println(upperCaseWords);

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

//  public static List<String> allMatches(List<String> list, Predicate<String> p) {
//    List<String> listTwo = new LinkedList<>();
//    for (String s : list) {
//      if (p.test(s))
//        listTwo.add(s);
//    }
//    return listTwo;
//  }

  public static <T> List<T> allMatches(List<T> list, Predicate<T> p) {
    List<T> listTwo = new LinkedList<>();
    for (T s : list) {
      if (p.test(s))
        listTwo.add(s);
    }
    return listTwo;
  }

  public static <T> List<T> transformedList(List<T> list, Function<T, T> f) {
    List<T> listTwo = new LinkedList<>();
    for (T s : list) {
      listTwo.add(f.apply(s));
    }
    return listTwo;
  }

}
