import java.security.SecureRandom;
import java.util.Scanner;

public class HangMan {

    String[] words = {"write", "that", "words", "price", "pain", "power", "scout"};
    public String getRandomWord() {
        SecureRandom randomNo = new SecureRandom();
        int index = randomNo.nextInt(words.length);
        String word = words[index];
        return word;

    }

    public void guess(){
        String randomWord = getRandomWord();
        System.out.println(randomWord);
        for (int index =0; index < randomWord.length(); index++){
            System.out.print("*");
        }
        Scanner input = new Scanner(System.in);
        for(int index = 0; index < randomWord.length(); index++){
            System.out.print("Enter a letter: ");
            char letter = input.next().charAt(0);
            for(int count =0; count < randomWord.length(); count++){
            if (letter == randomWord.charAt(count)){

            }}
        }
    }


}

class Test{
    public static void main(String[] args) {

        HangMan obj = new HangMan();
        obj.guess();
    }
}