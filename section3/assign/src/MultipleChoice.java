/**
 * MultipleChoice
 */
import java.util.ArrayList;

public class MultipleChoice<T> extends Question {
  private String question;
  private T answer;
  private ArrayList<T> choices;

  public MultipleChoice(String q, T a) {
    super(q,a);
    choices.add(answer);
  }
  public MultipleChoice(String q, T a, Collection<T> c) {
    super(q,a);
    choices.add(a); addChoice(c);
  }

  // Copy Constructor
  public MultipleChoice(final MultipleChoice q) {
    question = q.getQuestion();
    answer = q.getAnswer();
    choices = q.getChoices();
  }

  public void addChoice(final T choice) { choices.add(choice); }
  public void addChoice(Collection<T> choiceArray) { choices.addAll(choiceArray); }

  public void removeChoice(Integer index) { choices.remove(index); }
  public void removeChoice(final T choice) { choices.remove(choice); }
  public void removeChoice(Collection<T> choiceArray) { choices.removeAll(choiceArray); }

  public String getQuestion() { return(question); }
  public T getAnswer() { return(answer); }
  public ArrayList getChoices() { return(choices); }

  public Boolean guess(Integer g) {
    return(answer == choices.get(g));
  }
}