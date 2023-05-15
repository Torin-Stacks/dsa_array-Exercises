import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {

        SecureRandom randomNumber = new SecureRandom();
        int[] arrayOfNoOfTimesEachFaceOccurs = new int[7];

        for(int count = 1; count<=600000; count++){

            arrayOfNoOfTimesEachFaceOccurs[1 + randomNumber.nextInt(6)] = arrayOfNoOfTimesEachFaceOccurs[1 + randomNumber.nextInt(6)] + 1;

        }

        System.out.printf("%s %10s %n", "Face", "Frequency");

        for(int count = 1; count < arrayOfNoOfTimesEachFaceOccurs.length; count++){
            System.out.printf("%d %5d %n", count, arrayOfNoOfTimesEachFaceOccurs[count]);
        }
    }
}
