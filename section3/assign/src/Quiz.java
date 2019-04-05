import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;;
/**
 * Quiz
 * Problem Statement I
 * 
 * Write a program that prompts users with questions and multiple choice answers, verifies the answer and gives them a score.
 * Use the Scanner class to ask the questions and Q to quit.
 * 
 */
public class Quiz {
  protected static ArrayList<Question> questionList;
  
  protected static void loadQuestions(BufferedReader reader) throws IOException {
    System.out.println("LoadQuestions");
    String line;
    int index = 0;
    while ((line = reader.readLine()) != null) {
      questionList.get(index).setQuestion(line);
      index += 1;
    }
    reader.close();
  }
  protected static void loadAnswers(BufferedReader reader) throws IOException {
    System.out.println("LoadAnswers");
    String line;
    while ((line = reader.readLine()) != null) {
      String[] values = line.split(", ");
      if (values.length > 1) {
        MultipleChoice q = new MultipleChoice();
        q.addChoice(values);
        q.setAnswer(values[0]);
        questionList.add(q);
      } else {
        Question q = new Question();
        q.setAnswer(values[0]);
        questionList.add(q);
      }
    }
    reader.close();
  }
  public static void main(String[] args) {
    questionList = new ArrayList<>();
    BufferedReader ans = ResourceLoader.getReader(ResourceLoader.getStream("res/answers.txt"));
    BufferedReader qus = ResourceLoader.getReader(ResourceLoader.getStream("res/questions.txt"));

    try {
      loadAnswers(ans);
      loadQuestions(qus);
    } catch (IOException e) {
      System.out.println("Error on Input");
    }

    Scanner userInput = new Scanner(System.in);
    Boolean exit = false;
    Integer index = 0;
    while (!exit) {
      System.out.println(questionList.get(index).getQuestion());
      if (index == questionList.size()-1) {
        exit = true;
      }
      index += 1;
    }
  }
}