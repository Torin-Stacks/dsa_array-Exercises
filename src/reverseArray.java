import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        reverseArr(array);
    }
//    public static void reverseArr(int[] numbers){
//        int[] newNUmber = new int[numbers.length];
//        for(int index = numbers.length -1; index >= 0; index--){
//            for(int index2 = 0; index2 < newNUmber.length; index2++){
//                newNUmber[index2] = numbers[index];
//            }
//        }
//
//        System.out.println(Arrays.toString(newNUmber));
//    }

    public static void reverseArr(int[] numbers){
        int index;
        System.out.print("[");
        for(index = numbers.length -1; index >= 1; index--){
            System.out.print(numbers[index] + "," ) ;

        }
        System.out.println(numbers[index] + "]");

    }
}
