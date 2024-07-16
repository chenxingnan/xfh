package com.park.test;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringUtils {


    public static void main(String[] args) {
        String number = "abc123";
        Pattern pattern = Pattern.compile("\\d{1,}");
        Matcher matcher = pattern.matcher(number);
        int subIndex = 0 ;
        while (matcher.find()){
            subIndex = matcher.start();
            break;
        }
        String substring = number.substring(subIndex);
        System.out.println(substring);
        Double aDouble = Double.valueOf(substring);
        DecimalFormat bigDecimal = new DecimalFormat("#.00");
        String format = bigDecimal.format(aDouble);
        System.out.println(format);
    }
}
