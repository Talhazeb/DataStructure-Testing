package com.a1;

import static org.junit.Assert.*;

import com.a1.LinkedList.Node;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedList_Test 
{
    @Test
    public void test_pushFront()
    {
        LinkedList l1 = new LinkedList();

        l1.pushFront(1);
        assertEquals(l1.head.key, 1);

    }

    @Test
    public void test_pushBack()
    {
        LinkedList l1 = new LinkedList();

        l1.pushFront(1);
        assertEquals(l1.head.key, 1);

        l1.pushBack(10);
        Node temp=l1.head;
		while(temp.next!=null){
			temp=temp.next;
		}
        assertEquals(temp.key, 10);
    }

    @Test
    public void test_popFront()
    {
        LinkedList l1 = new LinkedList();

        l1.pushFront(1);
        l1.pushBack(10);

        l1.pushFront(2);
        l1.pushBack(20);

        l1.popFront();
        assertEquals(l1.head.key, 1);

    }

    @Test
    public void test_popBack()
    {
        LinkedList l1 = new LinkedList();

        l1.pushFront(1);
        l1.pushBack(10);
        l1.pushFront(2);
        l1.pushBack(20);
        l1.popFront();

        l1.popBack();
        Node temp=l1.head;
		while(temp.next!=null){
			temp=temp.next;
		}
        assertEquals(temp.key, 10);

    }

    @Test
    public void test_popPosition()
    {
        LinkedList l1 = new LinkedList();

        l1.pushFront(1);
        l1.pushBack(10);
        l1.pushFront(2);
        l1.pushBack(20);
        
        l1.pop(3);
        Node temp=l1.head;
		while(temp.next!=null){
			temp=temp.next;
		}

        l1.pop(0);
        assertEquals(l1.head.key, 1);
    }

}
