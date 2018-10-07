package com.davidxie.code;

import org.junit.Assert;
import org.junit.Test;

public class RepeatingCharactersTest {
    @Test
    public void testFind() {
        Assert.assertEquals(3, RepeatingCharactors.findLongestNonRepeatingSubstring("abcabcbb"));

        Assert.assertEquals(3, RepeatingCharactors.findLongestNonRepeatingSubstring("pwwkew"));

        Assert.assertEquals(1, RepeatingCharactors.findLongestNonRepeatingSubstring("bbbbbb"));
    }
}
