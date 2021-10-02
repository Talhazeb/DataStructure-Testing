package com.a1;

import static org.junit.Assert.*;

import com.a1.CircularLinkedList.Node;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CircularLinkedList_Test 
{
    @Test
    public void test_pushFront()
    {
        CircularLinkedList l1 = new CircularLinkedList();

        l1.pushFront(1);
        assertEquals(l1.head.key, 1);

    }

    @Test
    public void test_pushBack()
    {
        CircularLinkedList l1 = new CircularLinkedList();

        l1.pushFront(1);
        assertEquals(l1.head.key, 1);

        l1.pushBack(2);
        Node temp=l1.head;
		while(temp.next!=l1.head){
			temp=temp.next;
		}
        assertEquals(temp.key, 2);

    }

    @Test
    public void test_popFront()
    {
        CircularLinkedList l1 = new CircularLinkedList();

        l1.pushFront(1);
        l1.pushBack(2);
        l1.pushBack(3);
        l1.pushBack(4);

        l1.popFront();
        assertEquals(l1.head.key, 2);

    }
    
    @Test
    public void test_popBack()
    {
        CircularLinkedList l1 = new CircularLinkedList();

        l1.pushFront(1);
        l1.pushBack(2);
        l1.pushBack(3);
        l1.pushBack(4);

        l1.popBack();
        Node temp=l1.head;
		while(temp.next!=l1.head){
			temp=temp.next;
		}
        assertEquals(temp.key, 3);

    }


}
