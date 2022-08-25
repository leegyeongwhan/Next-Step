package com.ch3.calculatortest;

import com.ch3.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;


import static org.junit.jupiter.api.Assertions.*;


class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    public void setup() throws IOException {
        stringCalculator = new StringCalculator();
    }


    @Test
    public void 빈문자열또는널테스트() {
        assertEquals(0, stringCalculator.add(""));
        assertEquals(0, stringCalculator.add(null));
    }

    @Test
    public void 숫자하나만올경우테스트() {
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void 쉼표_구분자_테스트() {
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void 쉼표_구분자_테스트2() {
        assertEquals(6, stringCalculator.add("1,2:3"));
    }

    @Test
    public void 정규표현식테스트() {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
    }

    @Test()
    public void 음수테스트() {
        assertThrows(RuntimeException.class, () -> stringCalculator.add("-1"));
    }
}