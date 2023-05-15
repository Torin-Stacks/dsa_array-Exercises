import java.util.Arrays;

public class combinesTwoArraysAlternately {

    public static void main(String[] args) {
        char[] numbers = {'1', '2', '3'};
        char[] letters = {'a', 'b', 'c'};
        combineAlternately(numbers, letters);
    }
    public static void combineAlternately(char[] numbers, char[] letters){
        char[] combo = new char[numbers.length + letters.length];
        int indexNumbers = 0;
        int indexLetters = 0;
        int indexCombo = 0;

        while (indexCombo < combo.length){
            if(indexNumbers > indexLetters){
                combo[indexCombo] = letters[indexLetters];
                indexLetters++;
            }
            else{
                combo[indexCombo] = numbers[indexNumbers];
                indexNumbers++;
            }
            indexCombo++;
        }
        System.out.println(Arrays.toString(combo));
        }

    }




