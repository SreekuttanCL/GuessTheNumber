import javax.xml.transform.Source;
import java.util.Scanner;

public class DifficultyLevel {

    Scanner scanner = new Scanner(System.in);
    RandomNumber randomNumber = new RandomNumber();

    int guessedNumber;
    int randNumber;
    int score = 0;

    public void difficultyLevelEasy() {

        System.out.println("Guess a number between 1 and 5: ");

        for(int i=1; i<=5; i++){
            System.out.println("Round " + i);
            System.out.println("Your Guess: ");
            guessedNumber = scanner.nextInt();
            randNumber = randomNumber.randomNumberLevelEasy(1,6);

            if (guessedNumber >=1 && guessedNumber < 6) {
                if (guessedNumber == randNumber) {
                    score+=1;
                    System.out.println("Congratulations! You have guessed the correct number.");
                }
                else {
                    System.out.println("Try again next time.");
                }
            }
            else
                System.out.println("Guessed number out of bounds! Please enter a value between 1 & 5.");

        }
        System.out.println("Total Score: " + score);
    }

    public void difficultyLevelMedium() {
        System.out.println("Guess a number between 1 and 10: ");

        for(int i=1; i<=5; i++){
            System.out.println("Round " + i);
            System.out.println("Your Guess: ");
            guessedNumber = scanner.nextInt();
            randNumber = randomNumber.randomNumberLevelEasy(1,11);

            if (guessedNumber >=1 && guessedNumber < 11) {
                if (guessedNumber == randNumber) {
                    score+=1;
                    System.out.println("Congratulations! You have guessed the correct number.");
                }
                else {
                    System.out.println("Try again next time.");
                }
            }
            else
                System.out.println("Guessed number out of bounds! Please enter a value between 1 & 10.");

        }
        System.out.println("Total Score: " + score);
    }

    public void difficultyLevelHard() {
        System.out.println("Guess a number between 1 and 20: ");

        for(int i=1; i<=5; i++){
            System.out.println("Round " + i);
            System.out.println("Your Guess: ");
            guessedNumber = scanner.nextInt();
            randNumber = randomNumber.randomNumberLevelEasy(1,21);

            if (guessedNumber >=1 && guessedNumber < 21) {
                if (guessedNumber == randNumber) {
                    score+=1;
                    System.out.println("Congratulations! You have guessed the correct number.");
                }
                else {
                    System.out.println("Try again next time.");
                }
            }
            else
                System.out.println("Guessed number out of bounds! Please enter a value between 1 & 20.");
        }
        System.out.println("Total Score: " + score);
    }
}
