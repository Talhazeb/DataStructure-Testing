package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Array_Test 
{
    @Test
    public void test_Input_Insert()
    {
        Array init = new Array();
        int[] expected = new int[100];
        for(int i=0; i<100; i++)
        {
            init.insert(i*5, i);
            expected[i] = i*5;
        }
        assertArrayEquals(expected, init.array);
    }

    @Test
    public void test_Delete()
    {
        Array init = new Array();
        int[] expected = new int[100];
        for(int i=0; i<5; i++)
        {
            init.insert(i, i);
        }
        for(int i=0; i<4; i++)
        {
            expected[i] = i;
        }
        init.delete(4);
        assertArrayEquals(expected, init.array);

    }

    @Test
    public void test_LinearSearch()
    {
        Array init = new Array();

        for(int i=0; i<10; i++)
        {
            init.insert(i, i);
        }

        boolean check = init.linearSearch(5);
        boolean expected = true;

        assertEquals(expected, check);

        check = init.linearSearch(15);
        expected = false;

        assertEquals(expected, check);
        
    }

    @Test
    public void test_BubbleSort()
    {
        Array init = new Array();
        int[] expected = new int[100];

        for(int i=0, j = 9; i<10; i++, j--)
        {
            init.insert(j, i);
            expected[i] = i;
        }

        init.bubbleSort();
        assertArrayEquals(expected, init.array);

        for(int i=0, j = -10, k=-1; i<0; i++, j++, k--)
        {
            init.insert(j, i);
            expected[i] = k;
        }

        init.bubbleSort();
        assertArrayEquals(expected, init.array);
        
    }

    @Test
    public void test_BinarySearch()
    {
        Array init = new Array();

        for(int i=0, j=5; i<5; i++, j--)
        {
            init.insert(j, i);
        }

        boolean check = init.binarySearch(5, 0, 5);
        boolean expected = true;

        assertEquals(expected, check);

        check = init.binarySearch(-4, 0, 10);
        expected = false;

        assertEquals(expected, check);
        
    }

}
