package chapter1;

import java.util.Scanner;

/**
 * Write a description of class HelloWorld here.
 *
 * @author lexvonbon
 * @version 0.1
 */
public class HelloWorld {
  // instance variables - replace the example below with your own
  public static void main() {
        
    int x; //x has to be a Whole Integer, possibly negative 16bits
    float f; //f has to be Decimal, possibly negative
    x = 4;
    f = 4;
    
    System.out.println("Hello World!");
    
    Scanner input = new Scanner(System.in);

    int i = input.nextInt();
    input.close();
    
    System.out.println(x+i);
    System.out.println(f+i);
    
    System.out.println("1+2");
  }
}
