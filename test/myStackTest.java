import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class myStackTest {

    @Test
    public void testStackExist(){
        MyStack stack = new MyStack(5);
        assertNotNull(stack);
    }

    @Test
    public void testIsStackEmpty(){
        MyStack stack = new MyStack(5);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackShouldNotBeEmptyAfterPush(){
        MyStack stack = new MyStack(5);
        stack.push("G-wagon");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testStackShouldNotBeEmptyAfterPushXAndYThenPop(){
        MyStack stack = new MyStack(5);
        stack.push("G-wagon");
        stack.push("Maybach");
        stack.pop();
        assertFalse(stack.isEmpty());



    }
}
