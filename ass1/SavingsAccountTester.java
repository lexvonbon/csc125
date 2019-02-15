package ass1;
import java.util.Scanner;
import java.io.*;

public class SavingsAccountTester {

  public static void main(String[] args) throws IOException {

    File myFile = new File(".//info.txt");
    Scanner acctFile = new Scanner(myFile);

    while(acctFile.hasNextLine()) {
      Scanner eachCol = new Scanner(acctFile.nextLine());
      eachCol.useDelimiter(",");

      while(eachCol.hasNextDouble()) {
        SavingsAccount mySavings = new SavingsAccount(eachCol.nextDouble());
        mySavings.addInterest(eachCol.nextDouble());
        System.out.println("My savings balance with interest is " + mySavings.getBalance());
      }
      eachCol.close();
    }
  acctFile.close();
  }
}
