package com.terzeron.spring.formatter;

import org.springframework.format.Formatter;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.number.NumberFormatter;

import java.util.Date;
import java.util.Locale;

public class SimpleFormatterTest {
    public static void main(String[] args) {
        testDateFormatter();
        testNumberFormatter();
    }

    private static void testDateFormatter() {
        Formatter dateFormatter = new DateFormatter();
        String dateAsString = dateFormatter.print(new Date(), Locale.KOREA);
        System.out.println("Date as string in korean locale is " + dateAsString);
    }

    private static void testNumberFormatter() {
        NumberFormatter doubleFormatter = new NumberFormatter();
        doubleFormatter.setPattern("####.###");
        String number = doubleFormatter.print(new Double(12325.1144d), Locale.ITALIAN);
        System.out.println("Number is " + number);
    }
}
