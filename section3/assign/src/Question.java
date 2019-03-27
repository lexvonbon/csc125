/**
 * Question
 */
public class Question<T> {
  private String question;
  private T answer;

  public Question() {
    question = "";
    answer = new T();
  }
  public Question(final String q, final T a) {
    question = q;
    answer = a;
  };

  public String getQuestion() { return(question); }
  public T getAnswer() { return(answer); }

  public Boolean guess(final T g) {
    return(g == answer);
  };
}