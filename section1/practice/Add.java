package section1.practice;

import java.util.Scanner;
/**
 * Write a description of class Add here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Add {
  public static void main() {
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();
    int y = input.nextInt();
    System.out.println(x+" + "+y+" = "+(x+y));

    int sum = 0;
    for(int i = 1; i < 11; i++) {
      sum += i;
    }
    System.out.println(sum);

    System.out.println("Enter a Length & Width: ");
    int l = input.nextInt();
    int w = input.nextInt();

    System.out.println("The Area is: "+(l*w)+"m");
    input.close();
  }
}
