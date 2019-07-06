package com.alekseybykov.examples.testng.selective.second;

import org.testng.annotations.Test;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-07-06
 */
public class SecondTest {
    @Test
    // Will be ignored
    public void test() {
        System.out.println("SecondTest");
    }
}