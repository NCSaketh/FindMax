package com.cg.findmax;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {
    @Test
    public void givenMaxAtPos1_ReturnTrue() {
        int result = FindMax.FindMaxInt(3, 2, 1);
        Assert.assertEquals(3, result);
    }

    @Test
    public void givenMaxAtPos2_ReturnTrue() {
        int result = FindMax.FindMaxInt(2, 3, 1);
        Assert.assertEquals(3, result);
    }

    @Test
    public void givenMaxAtPos3_ReturnTrue() {
        int result = FindMax.FindMaxInt(2, 1, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void givenFloatMaxAtPos1_ReturnTrue() {
        Float result = FindMax.FindMaxFloat(3.0f, 2.0f, 1.0f);
        Assert.assertEquals(3.0, result, 0.0);
    }

    @Test
    public void givenStringMaxAtPos1_ReturnTrue() {
        String result = FindMax.FindMaxString("Zip","Car", "Ant");
        Assert.assertEquals("Zip", result);
    }
    @Test
    public void givenStringMaxAtPos2_ReturnTrue() {
        String result = FindMax.FindMaxString("Car","Zip", "Ant");
        Assert.assertEquals("Zip", result);
    }
    @Test
    public void givenStringMaxAtPos3_ReturnTrue() {
        String result = FindMax.FindMaxString("Ant","Car", "Zip");
        Assert.assertEquals("Zip", result);
    }

    @Test
    public void givenGenericMaxAtPos1_ReturnTrue() {
        int result = FindMax.FindMaxGeneric(3, 2, 1);
        Assert.assertEquals(3, result);
    }

    public void givenGenereicMaxAtPos3_ReturnTrue() {
        String result = FindMax.FindMaxGeneric("Ant","Car", "Zip");
        Assert.assertEquals("Zip", result);
    }

}

