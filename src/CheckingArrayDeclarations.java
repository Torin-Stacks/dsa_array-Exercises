public class CheckingArrayDeclarations {
    public static void main(String[] args) {
//        int[] numbers, age;
//        numbers = new int[4];
//        age = new int[3];
//
//


//        String[] numbers = new String[]{"ban", "bxss", "abass"};
//        System.out.println(numbers[numbers.length / 2]);
//        System.out.println(7/2);

//        int[] array = new int[50];
//        for (int index = 0; index < array.length; index++){
//            array[index] = 5;
//
//        }
//        System.out.println(Arrays.toString(array));[] arrray = new int[5];

//        Scanner input = new Scanner(System.in);
//        int count = 0;
//        int total = 0;
//        while (count < 5){
//            System.out.println("Enter a number: ");
//            int[] array = new int[5];
//             array[count] = input.nextInt();
//             total = total + array[count];
//             count++;
//            System.out.println(Arrays.toString(array));
//            System.out.println(total);
//        }

//        Scanner input = new Scanner(System.in);
//        int count = 0;
//        int total = 0;
//        int[] array = new int[5];
//        while (count < array.length){
//            System.out.println("Enter a number: ");
//            if (count == 0) {array[count] = input.nextInt();}
//            else{
//                array[count] = input.nextInt() + array[count - 1];}
//                total = total + array[count];
//                count++;
//                System.out.println(Arrays.toString(array));
//                System.out.println(total);

 //       }

        try{
            int[] array = {2,3,4,5};
            System.out.println(array[10]);}

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
