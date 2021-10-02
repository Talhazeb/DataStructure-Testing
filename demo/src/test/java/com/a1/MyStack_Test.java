package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MyStack_Test
{
    
    @Test
    public void test_push() throws Exception
    {
        MyStack s1 = new MyStack(5);
        s1.push(1);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 1);

        s1.push(2);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 2);
        
        s1.push(3);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 3);

        s1.push(4);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 4);

        s1.push(5);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 5);

    }

    @Test(expected = Exception.class)
    public void test_push_full() throws Exception
    {
        MyStack s1 = new MyStack(5);
        s1.push(1);
        s1.push(2);        
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
    }

    @Test(expected = Exception.class)
    public void test_top_empty() throws Exception
    {
        MyStack s1 = new MyStack(5);

        s1.top();

    }

    @Test
    public void test_top() throws Exception
    {
        MyStack s1 = new MyStack(5);

        assertEquals(s1.topPointer, -1);

        s1.push(1);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 1);

        s1.push(2);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 2);
        
        s1.push(3);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 3);

        s1.push(4);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 4);

        s1.push(5);
        assertEquals(s1.arraytostoreStack[s1.topPointer], 5);

    }

    @Test(expected = Exception.class)
    public void test_pop_empty() throws Exception
    {
        MyStack s1 = new MyStack(5);

        s1.pop();

    }

    @Test
    public void test_pop() throws Exception
    {
        MyStack s1 = new MyStack(5);

        s1.push(1);
        s1.push(2);        
        s1.push(3);
        s1.push(4);
        s1.push(5);

        s1.pop();
        assertEquals(s1.arraytostoreStack[s1.topPointer], 4);

        s1.pop();
        assertEquals(s1.arraytostoreStack[s1.topPointer], 3);

        s1.pop();
        assertEquals(s1.arraytostoreStack[s1.topPointer], 2);

        s1.pop();
        assertEquals(s1.arraytostoreStack[s1.topPointer], 1);

        s1.pop();
        assertEquals(s1.topPointer, -1);

    }

    @Test
    public void size() throws Exception
    {
        MyStack s1 = new MyStack(5);

        s1.push(1);
        s1.push(2);        
        s1.push(3);
        s1.push(4);

        assertEquals(s1.size(), 4);

    }

}
