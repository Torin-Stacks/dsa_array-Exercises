public class OddPosition {

    private static final int ZERO = 0;
    public static void main(String[] args) {
        int[] arr= new int[]{6,7,3,90,68,25,60};
        determineElementsOnOddPositions(arr);
    }

    public static void determineElementsOnOddPositions(int[] array){
        for(int index = ZERO; index < array.length; index++){
            if(index % 2 != 0){
                System.out.println(array[index]);
            }
        }
    }

}
