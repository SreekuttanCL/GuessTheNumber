import java.util.Scanner;

public class DifficultyLevel {

    Scanner scanner = new Scanner(System.in);
    RandomNumber randomNumber = new RandomNumber();

    int guessedNumber;
    int randNumber;

    public void difficultyLevelEasy() {

        System.out.println("Guess a number between 1 and 5: ");
        guessedNumber = scanner.nextInt();
        randNumber = randomNumber.randomNumberLevelEasy(1,6);

        System.out.println("Random Number: " + randNumber);

        if (guessedNumber >=1 && guessedNumber < 6) {
            if (guessedNumber == randNumber) {

                System.out.println("Congratulations! You have guessed the correct number.");
            }
            else {
                System.out.println("Try again next time.");
            }
        }
        else
            System.out.println("Guessed number out of bounds! Please enter a value between 1 & 5.");

    }

    public void difficultyLevelMedium() {
        System.out.println("Guess a number between 1 and 10: ");
        guessedNumber = scanner.nextInt();
        randNumber = randomNumber.randomNumberLevelEasy(1,11);

        System.out.println("Random Number: " + randNumber);

        if (guessedNumber >=1 && guessedNumber < 11) {
            if (guessedNumber == randNumber) {

                System.out.println("Congratulations! You have guessed the correct number.");
            }
            else {
                System.out.println("Try again next time.");
            }
        }
        else
            System.out.println("Guessed number out of bounds! Please enter a value between 1 & 10.");

    }

    public void difficultyLevelHard() {
        System.out.println("Guess a number between 1 and 20: ");
        guessedNumber = scanner.nextInt();
        randNumber = randomNumber.randomNumberLevelEasy(1,21);

        System.out.println("Random Number: " + randNumber);

        if (guessedNumber >=1 && guessedNumber < 21) {
            if (guessedNumber == randNumber) {

                System.out.println("Congratulations! You have guessed the correct number.");
            }
            else {
                System.out.println("Try again next time.");
            }
        }
        else
            System.out.println("Guessed number out of bounds! Please enter a value between 1 & 20.");
    }
}
