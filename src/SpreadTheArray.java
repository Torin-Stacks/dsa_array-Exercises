import java.util.ArrayList;

public class SpreadTheArray {

    public ArrayList<Integer> spreadArray(int[] arr) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int index = 0; index<arr.length; index++){

            array.add(arr[index] / 10);
            array.add(arr[index] % 10);
        }
        return array;
    }
}
