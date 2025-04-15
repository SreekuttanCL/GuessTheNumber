import java.util.Random;

public class RandomNumber {

    Random random = new Random();

    public int randomNumberLevelEasy(int minNumber,int maxNumber){

        int randomNumber = random.nextInt(minNumber, maxNumber);
        return randomNumber;
    }

    public int randomNumberLevelMedium(int minNumber, int maxNumber){

        int randomNumber = random.nextInt(minNumber, maxNumber);
        return randomNumber;
    }

    public int randomNumberLevelHard(int minNumber, int maxNumber){

        int randomNumber = random.nextInt(minNumber, maxNumber);
        return randomNumber;
    }
}
