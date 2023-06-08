import java.util.Scanner;

public class quizgame {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int score = 0;

    System.out.println("Welcome to the Quiz Game!");
    System.out.println("Question 1: What is the capital of France?");
    System.out.println("A. Madrid");
    System.out.println("B. Paris");b
    System.out.println("C. Rome");
    System.out.println("D. London");
    String answer = input.nextLine().toUpperCase();

    if(answer.equals("B")) {
      System.out.println("Correct!");
      score++;
    }
    else {
      System.out.println("Incorrect!");
    }

    System.out.println("Question 2: What is the largest planet in our solar system?");
    System.out.println("A. Jupiter");
    System.out.println("B. Earth");
    System.out.println("C. Mars");
    System.out.println("D. Venus");

    answer = input.nextLine().toUpperCase();

    if(answer.equals("A")) {
      System.out.println("Correct!");
      score++;
    }
    else {
      System.out.println("Incorrect!");
    }

    System.out.println("Question 3: What is the tallest mammal?");
    System.out.println("A. Hippopotamus");
    System.out.println("B. Elephant");
    System.out.println("C. Giraffe");
    System.out.println("D. Gorilla");

    answer = input.nextLine().toUpperCase();

    if(answer.equals("C")) {
      System.out.println("Correct!");
      score++;
    }
    else {
      System.out.println("Incorrect!");
    }

    System.out.println("Congratulations, you have completed the quiz!");
    System.out.println("Your final score is " + score + " out of 3.");
  }
}
