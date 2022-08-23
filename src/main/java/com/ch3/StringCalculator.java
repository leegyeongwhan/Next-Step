package com.ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] numbers = text.split(",");
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimeter = m.group();
            String[] tokens = m.group(2).split(customDelimeter);
        }
        return Integer.parseInt(text);
    }
}