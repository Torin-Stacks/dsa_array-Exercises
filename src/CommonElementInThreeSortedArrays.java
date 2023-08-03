import java.util.ArrayList;

public class CommonElementInThreeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,3};
        int[] arr2 = {1,9,2,5,4};
        int[] arr3 = {7,4,9,2};
        commonElementInThreeSortedArrays(arr1,arr2,arr3);
    }
    public static void commonElementInThreeSortedArrays(int[] arr1, int[] arr2, int[] arr3){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
             for(int j = 0; j < arr2.length; j++){
                 if(arr1[i] == arr2[j]) {
                     arrayList1.add(arr1[i]);
                     break;
                 }
             }
         }
         for(int k = 0; k< arr3.length; k++) {
             for (int h = 0; h < arrayList1.size(); h++) {
                 if (arr3[k] == arrayList1.get(h)){
                     arrayList2.add(arr3[k]);
                     break;
                 }
             }

         }
         for(Integer num: arrayList2){
             System.out.println(num);
         }
    }
}
