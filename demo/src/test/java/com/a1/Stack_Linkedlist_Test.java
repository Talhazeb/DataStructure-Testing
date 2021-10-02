package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class Stack_Linkedlist_Test
{
    @Test
    public void test_push() throws Exception
    {
        Stack_Linkedlist s1 = new Stack_Linkedlist();
        
        assertEquals(s1.head, null);

        s1.push(1);
        assertEquals(s1.head.key, 1);

        s1.push(2);
        assertEquals(s1.head.key, 2);

        s1.push(3);
        assertEquals(s1.head.key, 3);

    }

    @Test
    public void test_top() throws Exception
    {
        Stack_Linkedlist s1 = new Stack_Linkedlist();
        
        assertEquals(s1.top(), -1);

        s1.push(1);
        assertEquals(s1.top(), 1);

        s1.push(2);
        assertEquals(s1.top(), 2);

        s1.push(3);
        assertEquals(s1.top(), 3);

    }

    @Test
    public void test_pop() throws Exception
    {
        Stack_Linkedlist s1 = new Stack_Linkedlist();
    
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        s1.pop();
        assertEquals(s1.top(), 3);

        s1.pop();
        assertEquals(s1.top(), 2);

        s1.pop();
        assertEquals(s1.top(), 1);

        s1.pop();
        assertEquals(s1.top(), -1);

    }

    @Test
    public void test_size() throws Exception
    {
        Stack_Linkedlist s1 = new Stack_Linkedlist();
    
        assertEquals(s1.getSize(), 0);

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        assertEquals(s1.getSize(), 4);

    }



}
