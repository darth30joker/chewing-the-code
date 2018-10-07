package com.davidxie.code;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testFind() {
        Assert.assertArrayEquals(new int[]{0, 1}, TwoSum.find(new int[]{2,7,11,15}, 9));

        Assert.assertArrayEquals(new int[]{2, 3}, TwoSum.find(new int[]{2,7,11,15}, 26));

        Assert.assertArrayEquals(new int[]{0, 2}, TwoSum.find(new int[]{3, 2, 3}, 6));
    }
}
