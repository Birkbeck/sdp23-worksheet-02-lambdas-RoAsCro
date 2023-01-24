import java.util.Arrays;
import java.util.Comparator;

public class Outline {
  public static void main(String... args) { // varargs alternative to String[]
    Integer[] intArray = {1,7,3,4,8,2};
    System.out.println(Arrays.asList(intArray));
    String[] stringArray = {"a", "aba", "d", "hifja", "fe", "kef"};
    System.out.println("aa".compareTo("b"));
    Arrays.sort(stringArray, (o1, o2) -> o1.length() - o2.length());
    System.out.println(Arrays.asList(stringArray));

    Arrays.sort(stringArray, (o1, o2) -> o2.length() - o1.length());
    System.out.println(Arrays.asList(stringArray));


    String[] stringArray2 = {"ada", "a", "ab", "hiefja", "fe", "kef"};
    Arrays.sort(stringArray2, (o1, o2) -> o1.charAt(0) - o2.charAt(0));
    System.out.println(Arrays.asList(stringArray2));

    Arrays.sort(stringArray2, (o1, o2) -> o1.contains("e") ? -1 : 1);
    System.out.println(Arrays.asList(stringArray2));

    // Arrays.sort(intArray,.......)
  } 
}
