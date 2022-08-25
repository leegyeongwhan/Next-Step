package com.ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {

        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] numbers = text.split(",");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }
        return sum;

        //else if (text.contains(",") && text.contains(":")) {
//            String[] numbers = text.split(",|:");
//            int sum = 0;
//            for (int i = 0; i < numbers.length; i++) {
//                if(){
//
//                }
//                sum += Integer.parseInt(numbers[i]);
//            }
//        }

//        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
//        if (m.find()) {
//            String customDelimeter = m.group();
//            String[] tokens = m.group(2).split(customDelimeter);
//        }1111
    }
}
