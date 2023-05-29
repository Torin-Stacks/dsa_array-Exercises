import java.util.Arrays;

public class RunningTotal {

    private static final int ZERO = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        calculateRunningTotal(arr);
    }

    public static void calculateRunningTotal(int[] arr){
        for(int index = ZERO; index < arr.length; index++){
            if(index == ZERO){arr[index] = arr[index];}
            else{arr[index] = arr[index] + arr[index-1];}

        }
        System.out.println(Arrays.toString(arr));
    }
    }

