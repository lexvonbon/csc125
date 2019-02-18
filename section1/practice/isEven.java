package section1.practice;

import java.util.Scanner;

/**
 * Write a description of class isEven here.
 *
 * @author (lexvonbon)
 * @version (0.1)
 */
public class isEven {

  public static void main() {
    // instance variables - replace the example below with your own
    Scanner input = new Scanner(System.in);

    if (input.nextInt() % 2 == 0) {
      System.out.println("Yes");
    }
    input.close();
  }
}
