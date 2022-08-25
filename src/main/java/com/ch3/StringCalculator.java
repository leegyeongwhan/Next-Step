package com.ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {

        if (isaBlank(text)) {
            return 0;
        }
        return sum(toInts(getSplit(text)));
    }

    private String[] getSplit(String text) {
        String[] numbers = text.split(",");
        return numbers;
    }

    private boolean isaBlank(String text) {
        return text == null || text.isEmpty();
    }

    private int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

