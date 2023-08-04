import java.util.ArrayList;
import java.util.Arrays;

public class SecondLargestNumberInAString {

    public static void main(String[] args) {
        System.out.println(secondLargestNumber("abc1111"));
    }
    public static int secondLargestNumber(String digits){
        ArrayList<Integer> nums = new ArrayList<>();
        int max;
        int secondMax = -1;
        int num;
        for(int index = 0; index < digits.length(); index++){
            if(Character.isDigit(digits.charAt(index))){
                num = Character.getNumericValue(digits.charAt(index));
                nums.add(num);
            }}
            System.out.println(nums);

            max = nums.get(0);

            for(int number: nums){
                if(number > max){
                    secondMax = max;
                    max = number;
                }

            }
            return secondMax;


    }

//            for(int index2 = 0; index2 < nums.size(); index2++){
//                if(nums.get(index2) > max){
//                    secondMax = max;
//                    max = nums.get(index2);
//                }
//                return secondMax;
//            }




}
