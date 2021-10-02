package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Dequeue_Test 
{
    @Test
    public void test_addLeft() throws Exception
    {
        Dequeue q1 = new Dequeue(5);
        
        q1.addLeft(1);
        q1.addLeft(2);
        q1.addLeft(3);
        q1.addLeft(4);
        q1.addLeft(5);

        for(int i=0, j=1; i<5; i++, j++)
        {
            assertEquals(q1.array[i], j);
        }
    }

    @Test
    public void test_addRight() throws Exception
    {
        Dequeue q1 = new Dequeue(5);
        
        q1.addRight(5);
        q1.addRight(4);
        q1.addRight(3);
        q1.addRight(2);
        q1.addRight(1);

        for(int i=0, j=1; i<5; i++, j++)
        {
            assertEquals(q1.array[i], j);
        }
    }



   
}
