import java.util.Arrays;

public class Q7_11 {

    public static void main(String[] args) {
        int[] lst = new int[]{0,8,7,9,8};
        displayEachElementOnNewLine(lst);
    }
    public void setToZero(int[] arr){
        int length = arr.length;
        for(int index = 0; index< length; index++){
            if(index >= 10 && index <= 20){
                arr[index] = 0;
            }
        }
    }

    public static void multiplyByTwo(int[] bonus){
        for(int index = 0; index< bonus.length; index++){
            bonus[index] *= 2;
        }
        System.out.println(Arrays.toString(bonus));
    }

    public static void displayEachElementOnNewLine(int[] bestScores){
        for(int index = 0; index< bestScores.length; index++){
            System.out.println(bestScores[index]);
        }
    }



}
