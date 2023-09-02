package com.bootcoding.junit.array;

public class ArraySum {
    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) { // Press Alt+Enter to see the available actions.
            sum += value;
        }

        return sum;
    }
}
