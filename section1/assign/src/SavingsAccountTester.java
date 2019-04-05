import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Double;

public class SavingsAccountTester {
  public static void main(String[] args) throws IOException {

    BufferedReader file = new BufferedReader(new InputStreamReader(SavingsAccountTester.class.getResourceAsStream("info.txt")));
    String line;
    while((line = file.readLine()) != null) {
      String[] values = line.split(",");

      SavingsAccount mySavings = new SavingsAccount(Double.valueOf(values[0]));
      mySavings.addInterest(Double.valueOf(values[1]));
      System.out.println("My savings balance with interest is " + mySavings.getBalance());
    }
    file.close();
  }
}