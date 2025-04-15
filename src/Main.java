import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DifficultyLevel difficultyLevel = new DifficultyLevel();

        int chosenDifficultyLevel;

        System.out.println("GUESS THE RANDOM NUMBER");
        System.out.println("Press enter to continue.");
        scanner.nextLine();

        System.out.println("LET'S START THE GAME");
        System.out.println("Choose difficulty: ");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        chosenDifficultyLevel = scanner.nextInt();

        switch (chosenDifficultyLevel) {
            case 1 -> difficultyLevel.difficultyLevelEasy();
            case 2 -> difficultyLevel.difficultyLevelMedium();
            case 3 -> difficultyLevel.difficultyLevelHard();
            default -> System.out.println("Invalid Option!");
        }

    }
}