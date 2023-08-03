import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MySetTest {

    MySet obj = new MySet();

    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

    @Test
    public  void testAddMethodOnlyAddsUniqueElements(){
        obj.add("s");
        obj.add("s");
        obj.add("a");
        assertEquals(2, obj.size());
    }

    @Test
    public  void testAddAllMethodOnlyAddsUniqueElements(){

        obj.add("s");
        obj.add("s");
        obj.add("a");
        String[] arr = {"s","a","c"};
        obj.addAll(arr);
        assertEquals(3, obj.size());
    }

    @Test
    public void testMethodClearRemovesAllSetElements(){
        obj.add("s");
        obj.add("p");
        obj.clear();
        assertEquals(0,obj.size());
    }


    @Test
    public  void testContainsMethod(){

        obj.add("s");
        obj.add("s");
        obj.add("a");
        Boolean resp = obj.contains("a");
        assertTrue(resp);
    }

    @Test
    public  void testContainsAllMethod(){

        obj.add("s");
        obj.add("s");
        obj.add("a");
        String[] arr = {"s","a","c"};
        Boolean resp = obj.containsAll(arr);
        assertFalse(resp);
    }


    @Test
    public  void testIsEmptyMethodl(){

        obj.add("s");
        obj.add("s");
        obj.add("a");
        boolean resp = obj.isEmpty();
        assertFalse(resp);
    }

//    @Test
//    public  void testIteratorMethod(){
//
//        obj.add("s");
//        obj.add("s");
//        obj.add("a");
//        Object value = obj.iterator();
//        assertFalse(resp);
//    }

    @Test
    public  void testToArrayMethod(){

        obj.add("s");
        obj.add("s");
        obj.add("a");
        Object[] arr1 = {"s","a"};
        Object[] arr = obj.toArray();
        assertEquals(Arrays.toString(arr1),Arrays.toString(arr));
    }

//    @Test
//    public  void testRemoveMethod(){
//
//        obj.add("s");
//        obj.add("t");
//        obj.add("a");
//        obj.remove("s");
//        obj.remove("t"); //remove method is not working
//
//        assertEquals(1,obj.size());
 //   }

}