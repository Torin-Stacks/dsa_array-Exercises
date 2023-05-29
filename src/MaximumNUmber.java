public class MaximumNUmber {

    public static void main(String[] args) {
        int[] array = {2,4,6,7};
        System.out.println(maximum(array));
    }

    public static int maximum(int[] numbers){
        int maximumNo = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > maximumNo){
                maximumNo = numbers[index];
            }
        }
        return maximumNo;
    }
}
