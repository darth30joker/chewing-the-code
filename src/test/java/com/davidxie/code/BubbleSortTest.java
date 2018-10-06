package com.davidxie.code;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testSort() {
        final int[] numbers1 = new int[]{3, 2, 1};

        Assert.assertArrayEquals(new int[]{1, 2, 3}, BubbleSort.sort(numbers1));

        final int[] numbers2 = new int[]{5, 10, 6, 3, 7, 12, 9, 2, 1, 8, 4, 11};

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, BubbleSort.sort(numbers2));
    }
}
