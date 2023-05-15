import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pixelQuantizationTest {
    pixelQuantization obj = new pixelQuantization();
    int[] arr = new int[250];

    @Test
    public void testArrayIndex0to20(){
        int[] arry = new int[]{1,2,3,4,5,6,7,8,9,3,3,4,45,5,76,54,90,263,786,34,62,56,1,2,3,4,5,6,7,8,9};
        obj.checkIndexValue(arry);//given
        for (int index = 0; index < arry.length; index++) {
            assertEquals(10, arry[20]);
        }
    }

    @Test
    public void testArrayIndex21to40(){
        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(30, arr[21]);
        }
    }

    @Test
    public void testArrayIndex41to60(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(50, arr[57]);
        }
    }

    @Test
    public void testArrayIndex61to80(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(70, arr[70]);
        }
    }

    @Test
    public void testArrayIndex81to100(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(90, arr[100]);
        }
    }

    @Test
    public void testArrayIndex101to120(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(110, arr[102]);
        }
    }

    @Test
    public void testArrayIndex121to140(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(130, arr[125]);
        }
    }

    @Test
    public void testArrayIndex141to160(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(150, arr[150]);
        }
    }

    @Test
    public void testArrayIndex161to180(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(170, arr[180]);
        }
    }

    @Test
    public void testArrayIndex181andabove(){

        obj.checkIndexValue(arr);//given
        for (int index = 0; index < arr.length; index++) {
            assertEquals(190, arr[185]);
        }
    }


}