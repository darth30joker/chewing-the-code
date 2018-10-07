package com.davidxie.code;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SmileyFacesTest {
    @Test
    public void testCountSmileys() {
        List<String> a = new ArrayList<>();
        a.add(":)"); a.add(":)"); a.add("x-]"); a.add(":ox"); a.add(";-("); a.add(";-)"); a.add(";~("); a.add(":~D");
        Assert.assertEquals(4, SmileyFaces.countSmileys(a));
    }
}
