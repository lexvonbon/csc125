import java.util.Scanner;
class Loop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();
    input.close();
    int i = 0;
    while(string.charAt(i) != ' ' & i < string.length()) {
      i += 1;
    }
    System.out.println("The string: "+string+" has its first space at index: "+i);

    String word = "Barefoot";
    for(i = word.length(); i > 0; i -= 1) {
      System.out.print(word.charAt(i-1));
    }
    System.out.print("\n");
    for(i = 0; i < word.length(); i += 1) {
      System.out.println(word.charAt(i) + i);
    }
  }
}