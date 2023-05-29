import java.util.Arrays;

public class CombinesTwoArrays {
    public static void main(String[] args) {
        char[] numbers = {'1', '2', '3'};
        char[] letters = {'a', 'b', 'c'};
        combine(numbers, letters);
    }
    public static void combine(char[] numbers, char[] letters){
        char[] combo = new char[numbers.length + letters.length];
        for( int index = 0; index < numbers.length; index++){
            combo[index] = numbers[index];
        }
        for(int index = 0; index < letters.length; index++){
            combo[numbers.length + index] = letters[index];
        }
        System.out.println(Arrays.toString(combo));
        }


}
