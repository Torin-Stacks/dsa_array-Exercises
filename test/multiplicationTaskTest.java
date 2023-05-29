import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class multiplicationTaskTest {

    MultiplicationTask obj;

    @Test
    public void testObject(){
        obj = new MultiplicationTask();
        assertNotNull(obj);
    }
    @Test
    public void testMultiplyMethod(){
        obj = new MultiplicationTask();
        int actual=obj.multiply(0,3);
        assertEquals(0,actual);
    }
}
