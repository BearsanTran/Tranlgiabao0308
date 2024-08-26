import java.util.Random;
import java.util.Scanner;

public class Homework37 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int points = 0;
        int wrong = 0;

        while (wrong < 3) {
            int num1 = rand.nextInt(10); 
            int num2 = rand.nextInt(10);
            int correctAnswer = num1 + num2;
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            int userAnswer = console.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer + ".");
                wrong++;
            }
        }

        System.out.println("You earned " + points + " total points.");
        console.close();
    }
}
