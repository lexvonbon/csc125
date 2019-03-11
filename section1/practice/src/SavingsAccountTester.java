import java.util.Scanner;
import java.io.*;

class SavingsAccountTester {
  public static void main(String[] args) throws IOException {

    File myFile = new File(".\\info.txt");
    Scanner acctFile = new Scanner(myFile);

    while(acctFile.hasNextLine()) {
      Scanner eachCol = acctFile;
      eachCol.useDelimiter(",");

      while(eachCol.hasNextDouble()) {
        SavingsAccount mySavings = new SavingsAccount(eachCol.nextDouble(), eachCol.nextDouble());
        mySavings.age(1);
        System.out.println("My savings balance with interest is " + mySavings.getBalance());
      }
    }
  acctFile.close();
  }
}