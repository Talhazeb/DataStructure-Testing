package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArrayDeletion_Test 
{
    @Test
    public void test_deletion()
    {
        ArrayDeletion arr = new ArrayDeletion();
        
        int[] array = {1, 2, 3, 4, 5};

        array = arr.delete(array, 3);

        int[] expected = {1, 2, 3, 5, -1};

        assertArrayEquals(expected, array);
    }

    @Test
    public void test_deletion_empty()
    {
        ArrayDeletion arr = new ArrayDeletion();
        
        int[] array={1};

        array = arr.delete(array, 0);

        int[] expected = {-1};

        assertArrayEquals(expected, array);
    }

}
