package com.ch3.calculatortest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorSplitMethodTest {

    @Test
    public void spritTest() {
        String[] values = "1".split(",");
        assertArrayEquals(new String[]{"1"}, values);

        values = "1,2".split(",");
        assertArrayEquals(new String[]{"1", "2"}, values);
    }


}