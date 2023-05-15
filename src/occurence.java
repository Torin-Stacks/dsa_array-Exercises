import java.util.Arrays;

public class occurence {
    private static String name = "Ade";

    public static void main(String[] args) {
        String[] arr = {"Ade", "timi","sk"};
        checkOccurence(arr);
    }
    public static void checkOccurence(String[] array){

        for(int index = 0; index < array.length; index++ )
            if(array[index].equals(name)){
                System.out.println(Arrays.toString(array) +" contains "+ name);
            }
            else {
                System.out.println(Arrays.toString(array) +" does not contain "+ name);
            }

    }
}
