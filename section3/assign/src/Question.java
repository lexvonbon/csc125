/**
 * Question
 */
public class Question {
  private String question;
  private String answer;

  // Constructors
  public Question() { this("",""); }
  public Question(final String q, final String a) {
    question = q;
    answer = a;
  };
  // Copy Constructor
  public Question(final Question q) {
    question = q.getQuestion();
    answer = q.getAnswer();
  }
  // -----

  public String getQuestion() { return(question); }
  public String getAnswer() { return(answer); }

  public void setQuestion(final String q) { question = q; }
  public void setAnswer(final String a) { answer = a; }

  public Boolean checkAnswer(final String guess) {
    return(answer.equalsIgnoreCase(guess));
  };
}