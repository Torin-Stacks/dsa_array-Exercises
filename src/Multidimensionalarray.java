public class Multidimensionalarray {
    public static void main(String[] args) {

//        int [][] a =  {{1, 2},{3, 4, 5}};
//        int[][] b = new int[3][4];
//        int[][] c = new int[2][];
//        c[0] = new int[5];
//        c[1] = new int[3];

        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{1, 2}, {3}, {4, 5, 6}};

        printTwoDimensionalArray(a);


    }

    public static void printTwoDimensionalArray(int[][] array) {
        for (int rowindex = 0; rowindex < array.length; rowindex++) {
            for (int columnindex = 0; columnindex < array[rowindex].length; columnindex++) {
                System.out.printf("%d ",array[rowindex][columnindex]);
            }

            System.out.println();
        }

    }
}