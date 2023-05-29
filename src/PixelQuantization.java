public class PixelQuantization {


    public int[] checkIndexValue(int[] arr) {

        int length = arr.length;
        for(int index = 0; index < length; index++){
            if (index >= 0 && index <= 20){
                arr[index] = 10;
            }
            else if(index >= 21 && index <= 40){
                arr[index] = 30;
            }
            else if(index >= 41 && index <= 60){
                arr[index] = 50;
            }
            else if(index >= 61 && index <= 80){
                arr[index] = 70;
            }
            else if(index >= 81 && index <= 100){
                arr[index] = 90;
            }
            else if(index >= 101 && index <= 120){
                arr[index] = 110;
            }
            else if(index >= 121 && index <= 140){
                arr[index] = 130;
            }
            else if(index >= 141 && index <= 160){
                arr[index] = 150;
            }
            else if(index >= 161 && index <= 180){
                arr[index] = 170;
            }
            else{arr[index] = 190;}
        }
        return arr;
    }
}
