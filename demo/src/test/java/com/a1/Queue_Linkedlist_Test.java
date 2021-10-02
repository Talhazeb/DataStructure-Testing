package com.a1;

import static org.junit.Assert.*;

import com.a1.Queue_Linkedlist.Node;

import org.junit.Test;

public class Queue_Linkedlist_Test
{
    @Test
    public void test_enqueue()
    {
        Queue_Linkedlist q1= new Queue_Linkedlist();

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        Node temp= q1.head;
        int i=1;
		while(temp.next!=null)
        {
            assertEquals(temp.key, i);
			temp=temp.next;
            i++;
		}
    }

    @Test
    public void test_dequeue()
    {
        Queue_Linkedlist q1= new Queue_Linkedlist();

        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(4);
        q1.enqueue(5);

        Node temp= q1.head;
        int i=1;
		while(temp.next!=null)
        {
            assertEquals(temp.key, i);
			temp=temp.next;
            i++;
		}
    }

}
