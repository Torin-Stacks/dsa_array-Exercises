import java.util.Arrays;

public class MultiDimArrayClasswork {
    private static  final int ZERO = 0;
    private static  final int ONE = 1;
    private static  final int TWO = 2;
    private static  final int THREE = 3;
    private static  final int FOUR = 4;

    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[ZERO] = new int[5];
        arr[ONE] = new int[3];
        arr[TWO] = new int[10];
        arr[THREE] = new int[]{400, 500};
        arr[FOUR] = new int[5];

        int[] firstRow = arr[ZERO];
        int lengthOfFirstRow = firstRow.length;
        for( int index = ZERO; index < lengthOfFirstRow; index++){
            populateFirstRow(firstRow, index);
        }

        int[] secondRow = arr[ONE];
        int lengthOfSecondRow = secondRow.length;
        for (int index = ZERO; index < lengthOfSecondRow; index++){
            populateSecondRow(secondRow, index);

        }
        int[] thirdRow = arr[TWO];
        int lengthOfThirdRow = thirdRow.length;
        for(int index = 0; index < lengthOfThirdRow; index++){
            populateThirdRow(thirdRow,index);
        }

        int[] fifthRow = arr[FOUR];
        int lengthOfFifthRow = fifthRow.length;
        for(int index = 0; index < lengthOfFifthRow; index++){
            populateFifthRow(fifthRow,index);
        }

        System.out.println(Arrays.deepToString(arr));
    }

   public static void populateFirstRow (int[] firstRow, int index){
        firstRow[index] = index;
   }

    public static void populateSecondRow (int[] secondRow, int index){
        secondRow[index] = index;
    }

    public static void populateThirdRow (int[] thirdRow, int index){
        thirdRow[index] = index;
    }

    public static void populateFifthRow (int[] fifthRow, int index){
        fifthRow[index] = (index+1)* 100;
    }

}
