import java.awt.List;
import java.util.Collection;

/**
 * Test
 */
public class Test {
  Function<Integer, String> intToString(Integer num) {
    if (num == 1) {
      return("A");
    } else {
      return("B");
    }
  }
  public static void main(String[] args) {
    List<Integer> intColl = new List<Integer>();
    intColl.add(1);
    intColl.add(2);
    intColl.add(3);
    intColl.add(4);
    intColl.add(5);

    Functional.map(intToString, intColl);
  }
}