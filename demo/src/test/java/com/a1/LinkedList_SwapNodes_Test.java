package com.a1;

import static org.junit.Assert.*;

import com.a1.LinkedList_SwapNodes.Node;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedList_SwapNodes_Test 
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
        LinkedList_SwapNodes l1 = new LinkedList_SwapNodes();

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
    public void test_swap()
    {
        LinkedList_SwapNodes l1 = new LinkedList_SwapNodes();

        l1.pushFront(1);
        l1.pushBack(2);
        l1.pushBack(3);
        l1.pushBack(4);

        l1.swap();
        Node temp=l1.head;
        int i=1;
        while(temp.next!=null)
        {
            if(i == 1)
            {
                assertEquals(l1.head.key, 4);
            }
            else if(temp.next == null)
            {
                assertEquals(temp.key, 1);
            }
			else
                assertEquals(temp.key, i);
            
            i++;
            temp = temp.next;
		}        

    }


    
}
