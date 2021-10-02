package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrayInsertion_Test 
{
    @Test
    public void test_insertion()
    {
        ArrayInsertion arr = new ArrayInsertion();
        int [] array = new int[10];
        int [] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arr.insert(array,1,0);
		arr.insert(array,2,1);
		arr.insert(array,3,2);
		arr.insert(array,4,3);
		arr.insert(array,5,4);
		arr.insert(array,6,5);
		arr.insert(array,7,6);
        arr.insert(array,8,7);
        arr.insert(array,9,8);
        arr.insert(array,10,9);
        
        assertArrayEquals(expected, array);

    }

}
