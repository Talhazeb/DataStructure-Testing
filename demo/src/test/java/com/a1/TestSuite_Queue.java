package com.a1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Queue_Test.class, Queue_Circular_Test.class, Queue_Linkedlist_Test.class, Dequeue_Test.class})
public class TestSuite_Queue {
    
}