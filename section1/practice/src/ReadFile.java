import java.io.*;
import java.util.Scanner;
/* ReadFile */
public class ReadFile {
  // instance variables - replace the example below with your own
  public static void main() {
    File myFile = new File("./info.txt");
    System.out.println(myFile.getAbsoluteFile());
    Scanner input = new Scanner(myFile);
    //while(input.hasNextLine()) {
    //   System.out.println(input.nextLine());
    //}
    input.close();
  }
}
