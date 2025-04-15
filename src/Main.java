import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(1,5);
        //scanner.nextLine();

        System.out.print("Guess the number: ");
        int gussedNumber = scanner.nextInt();

        if (gussedNumber == randomNumber) {

            System.out.println("Random Number: " + randomNumber);
            System.out.println("Congratulations! You have guessed the correct number.");
        }
        else {
            System.out.println("Try again next time.");
        }

    }
}