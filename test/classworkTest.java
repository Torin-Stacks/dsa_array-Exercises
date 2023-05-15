import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class classworkTest {

//    @Test
//    public void testNumbersArray(){
//        int[] actual = classwork.check(new int[10]);
//        int[] expected = {1,2,3,4,5,6,7,8,9,10};
//
//        assertArrayEquals(expected, actual);
//    }

    @Test
    public void testArray(){
        int[] actual = classwork.check(new int[10]);

        for (int count = 0; count < actual.length; count++){
            assertEquals(count + 1, actual[count]);
        }
    }
}