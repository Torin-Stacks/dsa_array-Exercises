import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpreadTheArrayTest {

    SpreadTheArray obj = new SpreadTheArray();

    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }


    @Test
    public void testArraySpreads(){
        int[] arr = {10,23,43,62,12};
        ArrayList<Integer> newArray = obj.spreadArray(arr);
        assertEquals(1,newArray.get(0));
        assertEquals(0,newArray.get(1));
        assertEquals(2,newArray.get(2));
        assertEquals(3,newArray.get(3));







    }

}
