package com.a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Queue_Circular_Test 
{
    @Before
    public void test_enqueue_empty() throws Exception
    {
        Queue_Circular q1 = new Queue_Circular(5);

        assertEquals(q1.array[0], 0);
    }

    @Test
    public void test_enqueue() throws Exception
    {
        Queue_Circular q1 = new Queue_Circular(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);


        for(int i=0; i<5; i++)
        {
            assertEquals(q1.array[i], i+1);
        }
    }

    @Test
    public void test_dequeue() throws Exception
    {
        Queue_Circular q1 = new Queue_Circular(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        
        assertEquals(q1.dequeue(), 1);
    }

    @Test
    public void test_dequeue_empty() throws Exception
    {
        Queue_Circular q1 = new Queue_Circular(5);
        
        assertEquals(q1.dequeue(), -1);
    }

   
}
