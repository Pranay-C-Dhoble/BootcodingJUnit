package com.bootcoding.junit.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySumTest {
    @Test
    public void test(){
        ArraySum arraySum = new ArraySum();
        int[] array = {1,2,3,4,5};
        // Call sum() method of ArraySum class
        int actualSum = arraySum.sum(array);
        // Expected value is 15
        int expected = 15;
        // Assertion
        assertEquals(expected, actualSum);
    }

}