/**
 * Question
 */
public class Question {
    private String question;
    private String answer;

    public Question() {
        question = "";
        answer = "";
    }

    public Question(String[] questions, String[] answers) {

    }

    public void setQuestion(String currentQuestion) {
        question = currentQuestion;
    }

    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    public boolean guess(String guess) {
        return(answer.equalsIgnoreCase(guess));
    }
    
    public void display() {
        System.out.println(question);
    }
}