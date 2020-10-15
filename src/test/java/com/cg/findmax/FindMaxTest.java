package com.cg.findmax;

import org.junit.Assert;
import org.junit.Test;
public class FindMaxTest {
        @Test
        public void givenMaxAtPos1_ReturnTrue() {
            int result = FindMax.FindMaxInt(3,2,1);
            Assert.assertEquals(3, result);
        }
    }

