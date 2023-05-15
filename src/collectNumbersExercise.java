import java.util.Arrays;
import java.util.Scanner;

public class collectNumbersExercise {
    private static  final int ZERO = 0;
    public static void main(String[] args) {
        collectNo();
    }

    public static void collectNo(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int count = ZERO;
        int total = ZERO;
        double average = ZERO;
        while (count < numbers.length){
            System.out.println("Enter number " + (count + 1 )+ ": ");
            numbers[count] = input.nextInt();
            total = total + numbers[count];
            average = total/ numbers.length;
            count++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(total);
        System.out.println(average);

    }
}
