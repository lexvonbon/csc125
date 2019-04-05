import java.util.ArrayList;
import java.util.Collection;
/**
 * MultipleChoice
 */
public class MultipleChoice extends Question {
  private String question;
  private String answer;
  private ArrayList<String> choices;

  // Constructors
  public MultipleChoice() { this("", "", new String[]{}); }
  public MultipleChoice(final String q, final String a) { this(q, a, new String[]{}); }
  public MultipleChoice(final String q, final String a, String[] c) {
    super(q, a);
    choices = new ArrayList<>();
    if (a.length() > 0) { choices.add(a); }
    if (c.length > 0) { addChoice(c); }
  }
  // Copy Constructor
  public MultipleChoice(final MultipleChoice q) {
    question = q.getQuestion();
    answer = q.getAnswer();
    choices = q.getChoices();
  }
  // -----
  
  public String getQuestion() { return(question); }
  public String getAnswer() { return(answer); }
  public ArrayList<String> getChoices() { return(choices); }

  public void setQuestion(final String q) { question = q; }
  public void setAnswer(final String a) { answer = a; }
  public void setChoice(final Integer index, final String c) { choices.set(index, c); }

  public void addChoice(final String choice) { choices.add(choice); }
  public void addChoice(String[] choiceArray) {
    for (String choice: choiceArray) { choices.add(choice); }
  }

  public void removeChoice(Integer index) { choices.remove(index); }
  public void removeChoice(Collection<String> choiceArray) { choices.removeAll(choiceArray); }

  public Boolean checkAnswer(Integer index) {
    return(answer.equalsIgnoreCase(choices.get(index)));
  }
  public Boolean checkAnswer(String guess) {
    return(answer.equalsIgnoreCase(guess));
  }
}