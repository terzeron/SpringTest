package com.terzeron.spring.formatter;

import lombok.AllArgsConstructor;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.text.ParseException;
import java.util.Locale;

@AllArgsConstructor
public class CreditCardNumberFormatter implements Formatter {
    private Parser parser;
    private Printer printer;

    @Override
    public Object parse(String s, Locale locale) throws ParseException {
        return parser.parse(s, locale);
    }

    @Override
    public String print(Object o, Locale locale) {
        return printer.print(o, locale);
    }
}
