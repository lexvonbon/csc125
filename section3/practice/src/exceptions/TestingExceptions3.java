import java.util.*;
import java.io.*;

public class TestingExceptions3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your age:");
    try {
      checkUserAge(in);
    } catch(InputMismatchException e) {
      System.out.println("Bad Data:  entered value is not an integer");
    }
  }
  public static void checkUserAge(Scanner in) throws InputMismatchException {
    int age = in.nextInt();
    System.out.println("Your age is: "+ age);
  }
}
