import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        testForDuplicate(numbers);
    }


    public static ArrayList<Integer> populateArray(ArrayList<Integer> arr) {
        for (int index = 0; index < 10; index++) {
            arr.add(index, -1);
        }
        return arr;
    }

    public static ArrayList<Integer> testForDuplicate(ArrayList<Integer> array) {

        populateArray(array);
        System.out.println(array);
        Scanner input = new Scanner(System.in);
        int index;
        for (index = 0; index < 10; index++) {
            System.out.println("Enter number: ");
            int num = input.nextInt();
            if (!array.contains(num)) {
                array.set(index, num);
            }
            System.out.println(array);

        }
        return array;
    }
}