package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * DataAnalyzer
 */
public class DataAnalyzer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DataSetReader inputReader = new DataSetReader();
    try {
      System.out.println("Please enter the file name: ");
      String fileName = input.next();

      double[] data = inputReader.ReadFile(fileName);
      double sum = 0;
      for (double d: data) {
        sum += d;
      }
      System.out.println("The sum is "+sum);
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found: "+e.getMessage());
    } catch (BadDataException e) {
        System.out.println("Bad Data: "+e.getMessage());
    } catch (IOException e) {
        e.printStackTrace();
    }
  }
}