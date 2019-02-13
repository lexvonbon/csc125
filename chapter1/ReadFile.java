package chapter1;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFile {
  // instance variables - replace the example below with your own
  public static void main() {
    File myFile = new File("C:\\info");
    System.out.println(myFile.getAbsoluteFile());
    Scanner input = new Scanner(myFile);
    //while(input.hasNextLine()) {
    //   System.out.println(input.nextLine());
    //}
    //input.close();
  }
}
