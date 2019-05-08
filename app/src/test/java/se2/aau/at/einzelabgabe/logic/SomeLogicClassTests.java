package se2.aau.at.einzelabgabe.logic;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class SomeLogicClassTests {
    SomeLogicClass slc;

    @Before
    public void before(){
       slc = new SomeLogicClass();
    }

    @Test
    public void exceedsThreshold_below(){
        Assert.assertEquals(false, slc.exceedsThreshold(5));
    }

    @Test
    public void exceedsThreshold_above(){
        Assert.assertEquals(true, slc.exceedsThreshold(6));
    }
}
