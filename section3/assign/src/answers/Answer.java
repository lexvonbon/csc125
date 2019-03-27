/**
 * Answer
 */
public class Answer<T> {
  private T answer;

  public Answer(T a) {
    answer = a;
  }
  public Answer(Answer obj) {
    answer = obj.getAnswer();
  }

  protected T getAnswer() { return(answer); }
  public Boolean check(T guess) { return(answer.equals(guess)); }

  @Override
  public String toString() { return(answer.toString()); }
}