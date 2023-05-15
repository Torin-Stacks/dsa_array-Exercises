public class minimumNUmber {

    public static void main(String[] args) {
        int[] array = {2,4,6,7};
        System.out.println(minimum(array));
    }

    public static int minimum(int[] numbers){
        int minimumNo = numbers[0];
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < minimumNo){
                minimumNo = numbers[index];
            }
        }
        return minimumNo;
    }
}
