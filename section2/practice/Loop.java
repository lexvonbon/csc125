
class Loop {
  public static void main(String[] args) {
    String word = "Barefoot";
    for(int i = word.length(); i > 0; i -= 1) {
      System.out.print(word.charAt(i-1));
    }
    System.out.print("\n");
    for(int i = 0; i < word.length(); i += 1) {
      System.out.println(word.charAt(i) + i);
    }
  }
}