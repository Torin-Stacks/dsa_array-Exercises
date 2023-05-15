import java.util.Arrays;

public class stringToArray {
    public static void main(String[] args) {
        convertStringToArray("love");
        char[] toReverse = {'l','o','v','e'};
        reverseArr(toReverse);

    }
    public static void convertStringToArray(String word){
        char[] array = new char[word.length()];
        for(int index = 0; index < word.length(); index++){array[index] = word.charAt(index);}
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArr(char[] word){
        int index;
        System.out.print("[");
        for(index = word.length -1; index >= 1; index--){
            System.out.print(word[index] + "," ) ;

        }
        System.out.println(word[index] + "]");


    }
    public static void toCheckPalindromeArray(char[] word){


    }
}
