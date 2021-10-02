package com.a1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedList_2_Test 
{
    @Test
    public void test_add()
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {1, 2, 3};
        l1.add(1);
        l1.add(2);
        l1.add(3);

        LinkedList_2 temp = l1.headPointer;
        int i=0;
		while(temp.tailPointer.nextPointer!=null){
            assertEquals(temp.data, expected[i]);
            ++i;
			temp=temp.nextPointer;
		}
        
    }

    @Test
    public void test_pushFront()
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {3, 2, 1};
        l1.pushFront(1);
        l1.pushFront(2);
        l1.pushFront(3);

        LinkedList_2 temp = l1.headPointer;
        int i=0;
		while(temp.tailPointer.nextPointer!=null){
            assertEquals(temp.data, expected[i]);
			temp=temp.nextPointer;
            i++;
		}
        
    }

    @Test(expected = Exception.class)
    public void test_topFront_empty() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();

        l1.topFront();
        
    }

    @Test
    public void test_topFront() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {3, 2, 1};
        l1.pushFront(1);
        l1.pushFront(2);
        l1.pushFront(3);

        assertEquals(l1.topFront(), expected[0]);
        
    }

    @Test(expected = Exception.class)
    public void test_popFront_empty() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();

        l1.popFront();
        
    }

    @Test
    public void test_popFront() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {3, 2, 1};
        l1.pushFront(1);
        l1.pushFront(2);
        l1.pushFront(3);

        l1.popFront();

        assertEquals(l1.headPointer.data, expected[1]);
        
    }

    @Test
    public void test_pushBack()
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {1, 2, 3};
        l1.pushFront(1);
        l1.pushBack(2);
        l1.pushBack(3);

        LinkedList_2 temp = l1.headPointer;
        int i=0;
		while(temp.tailPointer.nextPointer!=null){
            assertEquals(temp.data, expected[i]);
			temp=temp.nextPointer;
            i++;
		}
        
    }

    @Test(expected = Exception.class)
    public void test_topBack_empty() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();

        l1.topBack();
    }

    @Test
    public void test_topBack() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();
        int[] expected = {1, 2, 3};
        l1.pushFront(1);
        l1.pushBack(2);
        l1.pushBack(3);

        l1.topBack();

        assertEquals(l1.topBack(), expected[2]);
    }

    @Test
    public void test_size() throws Exception
    {
        LinkedList_2 l1 = new LinkedList_2();
        l1.pushFront(1);
        l1.pushFront(2);
        l1.pushFront(3);


        assertEquals(l1.size(), 3);
    
    }

    
}
