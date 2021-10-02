package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Stack_Array_Test
{
    @Test
    public void test_push() throws Exception
    {
        Stack_Array s1 = new Stack_Array();
        
        s1.push(1);
        assertEquals(s1.array[s1.addPointer-1], 1);

        s1.push(2);
        assertEquals(s1.array[s1.addPointer-1], 2);

        s1.push(3);
        assertEquals(s1.array[s1.addPointer-1], 3);

        s1.push(4);
        assertEquals(s1.array[s1.addPointer-1], 4);

    }

    @Test
    public void test_pop() throws Exception
    {
        Stack_Array s1 = new Stack_Array();
        
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        s1.pop();
        assertEquals(s1.array[s1.addPointer-1], 3);

        s1.pop();
        assertEquals(s1.array[s1.addPointer-1], 2);

        s1.pop();
        assertEquals(s1.array[s1.addPointer-1], 1);

        s1.pop();
        assertEquals(s1.addPointer, 0);

    }

}
