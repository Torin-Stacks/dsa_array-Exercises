public class double_array {

    public int[] double_array(int[] arr){
        int[] newArray = new int[arr.length * 2];
        for (int index = 0; index < arr.length; index++){
            newArray[index] = arr[index];
        }
        return newArray;
    }
}
