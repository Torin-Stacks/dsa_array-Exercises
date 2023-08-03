import java.util.ArrayList;

public class MaxValueOfString {

    public static void main(String[] args) {
        //String[] arr = {"alic3", "4", "bob", "3","00000"};
        String[] arr = {"01","001","1","0001"};
        System.out.println(maxValueOfString(arr));
    }
    public static int maxValueOfString(String[] arr) {
        ArrayList<String> nums = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i< arr.length; i++){
            if (arr[i]. matches("-?\\d+(\\.\\d+)?")){
                nums.add(arr[i]);
            }
            else words.add(arr[i]);
        }
        for(String string: nums){
            System.out.println(string);
        }
        System.out.println();
        for(String string: words){
            System.out.println(string);
        }


        int maxNo = Integer.parseInt(nums.get(0));
        for(int j = 0; j < nums.size(); j++){
            if(Integer.parseInt(nums.get(j)) > maxNo){
                maxNo = Integer.parseInt(nums.get(j));
            }
        }
        System.out.println(maxNo);

        int maxlength = words.get(0).length();

//        for(int k = 0; k<= words.size(); k++){
//            if(words.get(k).length() > maxlength){
//                maxlength = words.get(k).length();
//            }
//        }
        System.out.println(maxlength);

        if (maxNo > maxlength){
            return maxNo;
        }
        return maxlength;
    }
}
