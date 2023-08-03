import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
       //int[] arr ={1,2,2,5,7,5};
       // System.out.println(returnDuplicateElements(arr));
        //pairEqualsTargetSum(arr,12);
        System.out.println(largestValuedOddNumber("354278"));
    }

//    public static ArrayList<Integer> returnDuplicateElements(int[] arr){
//        String dupes = "";
//        ArrayList<Integer> lst = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] == arr[j]){
//                    lst.add(arr[i]);
//                }
//            }
//        }
//        return lst;
//    }


 //   public  static int sumOfColumn(int[][] arr ){
//        int columnTotal = 0;
//        for(int i = 0; i < arr.length; i++){
//                columnTotal = columnTotal + arr[i][0];
//
//        }
//        return columnTotal;

//    }

//    public static int sumOfRow(int[][] arr){
//        int rowTotal= 0;
//        for (int i = 1 ;  i < arr.length; i++){
//            for(int j =0; j<arr[i].length; j++)
//            rowTotal = rowTotal+arr[i][j];
//            break;
//        }
//        return  rowTotal;
//    }
//    public static void pairEqualsTargetSum(int[] arr, int target){
//        int[] answer = new  int[2];
//        ArrayList<int[]> arrlist = new ArrayList<>();
//        for(int i = 0; i < arr.length; i++){
//            for ( int j = i+1; j< arr.length; j++){
//                if(arr[i] + arr[j] == target){
//                    answer[0] = arr[i];
//                    answer[0]= arr[j];
//                    arrlist.add(answer);
//                }
//            }
//        }
//        for(int i = 0; i<arrlist.size(); i++ ){
//            System.out.println(Arrays.deepToString(arrlist.get(i)));
//        }
//    }

//    public static int largestValuedOddNumber(String number){
//       ArrayList<Integer> odd = new ArrayList<>();
//        for(int i = 0; i < number.length(); i++){
//            int num = Character.getNumericValue(number.charAt(i));
//            if (num % 2 != 0){
//                odd.add(num);
//            }
//            }
//        int max = odd.get(0);
//        for(Integer num:odd){
//                if(num > max){
//                    max = num;
//                }
//            }
//
//        return max;
//        }


    public static String largestValuedOddNumber(String number) {

        for(int i = number.length()-1; i >= 0; i--){
            int num = Character.getNumericValue(number.charAt(i));
            if(num % 2 != 0){
                return number.substring(0,i+1);
            }
        }
        return " ";
    }
}
