import java.util.Scanner;

class Richter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float richter = input.nextFloat();
    input.close();

    if(richter >= 8.0) {
      System.out.println("Most buildings fall");
    } else if(richter >= 7.0) {
      System.out.println("Many buildings are destroyed");
    } else if(richter >= 6.0) {
      System.out.println("Many buildings are considerably damaged, some even collapse");
    } else if(richter >= 4.5) {
      System.out.println("Poorly constructed buildings are damaged");
    } else {
      System.out.println("No buildings are destroyed");
    }
  }
}