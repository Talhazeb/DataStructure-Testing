package com.a1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyStack_Test.class, Stack_Array_Test.class, Stack_Linkedlist_Test.class})
public class TestSuite_Stack {
    
}