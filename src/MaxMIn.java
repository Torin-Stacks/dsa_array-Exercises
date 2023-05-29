public class MaxMIn {

    public static void main(String[] args) {
        int[] a = {1,2,4,5};
        maxMin(a);
    }
    public static void maxMin(int[] array){
        int maxNo = array[0];
        int minNo = array[0];
        for(int index = 0; index < array.length; index++){
            if (index == 0){
                maxNo = array[index];
                minNo = array[index];
            }
            if(maxNo < array[index]) {
                maxNo = array[index];
            }
            else if(minNo > array[index]){
                minNo = array[index];
            }
        }
        System.out.println(maxNo + " " + minNo);
    }
}
