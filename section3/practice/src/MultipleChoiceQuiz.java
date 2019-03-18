import java.util.ArrayList;
/* MultipleChoiceQuiz */
public class MultipleChoiceQuiz extends Question {
    private ArrayList<String> choices;
    
    public MultipleChoiceQuiz() {
        super();
        choices = new ArrayList<String>();
    }

    public void addChoice(String option, boolean isCorrect) {
        choices.add(option);
        if(isCorrect) {
            String correctAnswer = "" + choices.size();
            setAnswer(correctAnswer);
        }
    }
    public void display() {
       super.display();
       for(int i = 0; i < choices.size(); i += 1) {
           int choiceNum = i + 1;
            System.out.println(choiceNum+")"+choices.get(i));
       } 
    }
}