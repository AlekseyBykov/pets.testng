package com.alekseybykov.examples.testng.selective.third;

import org.testng.annotations.Test;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 1.0
 * @since   2019-07-06
 */
public class FirstTest {
    @Test
    // Will be ignored
    public void test() {
        System.out.println("FirstTest");
    }
}