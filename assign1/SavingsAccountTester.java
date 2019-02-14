import java.util.Scanner;
import java.io.*;

public class SavingsAccountTester {

  public static void main(String[] args) throws IOException {

    File myFile = new File("info.txt");
    Scanner acctFile = new Scanner(myFile);

    while(hasNextLine()) {
      Scanner eachCol = new Scanner(acctFile);
      eachCol.useDelimiter(",");

      while(eachcol.hasNextDouble()) {
        SavingsAccount mySavings = new SavingsAccount(eachCol.nextDouble());
        mySavings.addInterest(eachCol.nextDouble());
        System.out.println("My savings balance with interest is " + mySavings.getBalance());
      }
    }
  acctFile.close();
  }
}
