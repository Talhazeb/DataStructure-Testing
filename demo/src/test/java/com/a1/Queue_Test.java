package com.a1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Queue_Test 
{
    @Before
    public void test_enqueue_empty() throws Exception
    {
        Queue q1 = new Queue(5);

        assertEquals(q1.array[0], 0);
    }

    @Test
    public void test_enqueue() throws Exception
    {
        Queue q1 = new Queue(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        for(int i=0, j=1; i<5; i++, j++)
        {
            assertEquals(q1.array[i], j);
        }
    }

    @Test(expected = Exception.class)
    public void test_enqueue_full() throws Exception
    {
        Queue q1 = new Queue(5);

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);
        q1.enqueue(6);
    }

    @Test(expected = Exception.class)
    public void test_dequeue_empty() throws Exception
    {
        Queue q1 = new Queue(5);

        q1.dequeue();
        
    }

    @Test
    public void test_dequeue() throws Exception
    {
        Queue q1 = new Queue(5);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        q1.dequeue();
        
        assertEquals(q1.array[q1.removePointer], 2);
    }

    @Test
    public void test_empty() throws Exception
    {
        Queue q1 = new Queue(5);
        
        assertTrue(q1.empty());

        q1.enqueue(1);
        assertFalse(q1.empty());

    }

    @Test
    public void test_size() throws Exception
    {
        Queue q1 = new Queue(5);
        
        assertEquals(q1.size(), 0);

        q1.enqueue(1);
        assertEquals(q1.size(), 1);

    }

    

}
