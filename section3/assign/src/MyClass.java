/**
 * MyClass
 * Problem Statement II
 * 
 * Given this pseudo test class MyClass below, modify the class to handle possible exceptions by adding throwing and handling exceptions where necessary.
 * You don't need to code this but just write in notepad by modifying the class below and showing what the exceptions and try/catch code will look like and upload the file as an attachment.
 * 
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClass {
  public void myMethod1() throws FileNotFoundException {
    myMethod2();
  }

  public void myMethod2() throws FileNotFoundException {
    myMethod3();
  }

  public void myMethod3() throws FileNotFoundException {
    File file = new File("filename.txt");
    Scanner sc = new Scanner(file);
  }
}