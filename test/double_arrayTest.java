import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class double_arrayTest {

    double_array obj;
    @BeforeEach
    void setUp() {
        obj = new double_array();
    }

    @Test
    public void testlengthOfArray(){
        int[] arr = {1,2,3};
        obj.double_array(arr);
        int length = arr.length;
        assertEquals(length * 2, length * 2);
    }

    @Test
    public void testElementOfNewArray(){
        int[] arr = {1,2,3};
        int[] arr2 = obj.double_array(arr);
        for(int index = 0; index < arr2.length; index++){
            assertEquals(arr2[3],0);
            assertEquals(arr2[4],0);
            assertEquals(arr2[5],0);

        }
    }

}