import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
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
  
  protected static void loadQuestions(final ArrayList<String> questions) {
    System.out.println("LoadQuestions");
    Integer index = 0;
    for (String question: questions) {
      questionList.get(index).setQuestion(question);
      index += 1;
    }
  }
  protected static void loadAnswers(final ArrayList<String> lines) {
    System.out.println("LoadAnswers");
    ArrayList<String[]> parsedLines = ResourceLoader.parseLines(lines);
    for (String[] line : parsedLines) {
      if (line.length > 1) {
        MultipleChoice q = new MultipleChoice();
        q.addChoice(line);
        q.setAnswer(line[0]);
        questionList.add(q);
      } else {
        Question q = new Question();
        q.setAnswer(line[0]);
        questionList.add(q);
      }
    }
  }
  protected static void startGame() {
  }
  protected static void endGame() {
    System.out.println("Thanks for Playing.");
  }
  protected static void readQuestion(Integer index) {

  }
  public static void main(String[] args) {
    questionList = new ArrayList<>();
    ArrayList<String> ans = ResourceLoader.getResource("res/answers.txt");
    ArrayList<String> qus = ResourceLoader.getResource("res/questions.txt");
    loadAnswers(ans);
    loadQuestions(qus);

    Scanner userInput = new Scanner(System.in);
    Boolean exit = false;
    Integer currentQuestion = 0;

    startGame();
    while (!exit) {
      System.out.print((currentQuestion+1)+". ");
      questionList.get(currentQuestion).readQuestion();
      Boolean isCorrect;

      if (userInput.hasNextInt()) {
        isCorrect = questionList.get(currentQuestion).checkAnswer(userInput.nextInt());
        System.out.println(isCorrect);
      } else if (userInput.hasNext()) {
        String in = userInput.next();
        if (in.equalsIgnoreCase("q")) {
          System.out.println("Thanks for playing.");
          System.exit(0);
        }
        if (in.length() == 1) {
          isCorrect = questionList.get(currentQuestion).checkAnswer(Character.getNumericValue(in.charAt(0))-10);
        } else {
          isCorrect = questionList.get(currentQuestion).checkAnswer(in);
        }
        System.out.println(isCorrect);
      }
      try {
        System.out.println("-----------------------");
        System.out.println();
      } finally {
        System.out.println("Was there output before this?");
      }
      // Check Answer For Score

      if (currentQuestion == questionList.size()-1) {
        exit = true;
      }
      currentQuestion += 1;
    }
    endGame();
  }
}