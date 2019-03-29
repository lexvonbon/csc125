/**
 * SingleChoice
 */
public class SingleChoice<T> extends Question {
  private String question;
  private T answer;

  public SingleChoice(String q, T a) {
    question = q;
    answer = a;
  }
  // Copy Constructor
  public SingleChoice(final SingleChoice q) {
    question = q.getQuestion();
    answer = q.getAnswer();
  }

  public String getQuestion() { return(question); }
  public T getAnswer() { return(answer); }

  public Boolean guess(String g) {
    return((answer.toString()).equalsIgnoreCase(g));
  }
}