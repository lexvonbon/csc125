package chapter11;

/**
 * Write a description of class TestingExceptions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestingExceptions {
  public static void main(String[] args) {
    divideByZero(2);
  }
  public static void divideByZero(int a) {
    try {
      System.out.println(a/0);
    } catch(ArithmeticException e) {
      System.out.println("Exception:"  + e.toString());
      System.out.println("Error: "+ e.getMessage());
    }
  }
}
