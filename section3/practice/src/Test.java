import java.util.ArrayList;

/**
 * Name
 */

/**
 * Test
 */
public class Test {
  protected static class Word {
    private String word;
    public Word() { word = ""; }
    public Word(String w) { word = w; }
    public String getWord() { return(word); }
    public void setWord(String w) { word = w; }
  }
  public static void main(String[] args) {
    ArrayList<Word> str = new ArrayList<>();
    str.add(new Word("Hello"));
    str.add(new Word("My"));
    str.add(new Word("Name"));
    str.add(new Word("Is"));
    str.add(new Word("Bret"));
    str.get(4).setWord("Lex");

    for (Word w: str) {
      System.out.println(w.getWord());
    }
  }
}