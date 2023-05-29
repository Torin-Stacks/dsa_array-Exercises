public class MultiplicationTask {

    public int multiply(int firstNo, int secondNumber) {
        int total = 0;
        if (firstNo < 0 ) firstNo= -(firstNo);
        if (secondNumber < 0) secondNumber =-(secondNumber);
        int[] arr = new int[(secondNumber)];
        for (int index = 0; index < arr.length; index++) {
                arr[index] = (firstNo);
            }
            for (int index = 0; index < arr.length; index++) {
                total = total + arr[index];
            }
        return total;
        }


    }



