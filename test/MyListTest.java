import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {

    MyArray obj = new MyArray();
    @Test
    public void testObjectExists(){
        assertNotNull(obj);
    }

    @Test
    public void testAddMethod(){
        obj.add(3);
       assertEquals(1,obj.size());

    }
    @Test
    public void testSetMethod(){
        obj.add("tosin");
        obj.set(0, "tolani");
        assertEquals("tolani",obj.get(0));
    }

    @Test
    public void testIndexOfMethod(){
        obj.add("tosin");
        int index = obj.indexOf("tosin");
        assertEquals(0,index);
    }


    @Test
    public void testContainsMethod(){
        obj.add("tosin");
        boolean ans= obj.contains("tolani");
        assertEquals(false,ans);
    }


    @Test
    public void testSizeMethod(){
        obj.add("tosin");
        obj.add("esther");
        int num = obj.size();
        assertEquals(2,num);
    }

    @Test
    public void testadd2Method(){
        obj.add("torin");
        obj.add("president");
        obj.add(1, "for");

        assertEquals("for",obj.get(1));}

    @Test
    public void testClearMethod(){
        obj.add("torin");
        obj.add("president");
        obj.clear();
        assertNotEquals("torin", obj.get(0));
        assertNull(obj.get(1));
    }

    @Test
    public void testRemoveByIndexMethod(){
        obj.add("torin");
        obj.add("president");
        obj.remove(0);
        assertEquals("president", obj.get(0));
        assertEquals(1, obj.size());
    }









}

