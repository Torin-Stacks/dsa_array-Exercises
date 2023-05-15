public class ArrayPractice {

    public static void main(String[] args) {

//        int[] a = new int[10];
//        System.out.printf("%s %8s %n", "Index", "Value");
//
//        for(int counter = 0; counter < a.length; counter++){
//            System.out.printf("%d %8d %n", counter, a[counter]);
//        }


        int[] gradeFrequency ={0,0,0,0,0,0,1,2,4,2,1};

        for(int index = 0; index < gradeFrequency.length; index++){
            if (index != 10) {
                System.out.printf("%02d - %02d: %n", index*10, index * 10 + 9);
            }

            else{
                System.out.printf("%5d: ", 100);
            }

            for(int asterisk = 0; asterisk < gradeFrequency[index]; asterisk++ ){
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
