import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyQueueTest {

    MyQueue obj = new MyQueue(5);

    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

//    @Test
//    public void testMethodAdd(){
//        obj.add("a");
//        assertEquals("a",obj.);
//
//    }

//    @Test
//    public void testMethodRemove(){
//        obj.add("a");
//        obj.add("b");
//        obj.remove();
//        assertEquals("a",obj.);
//
//    }

}
