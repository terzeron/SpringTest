package com.terzeron.spring.formatter;

import org.springframework.format.Printer;

import java.util.Locale;

public class CreditCardNumberPrinter implements Printer {
    public String print(Object o, Locale locale) {
        CreditCardNumber ccNumberObject = (CreditCardNumber) o;
        return ccNumberObject.getFirstFourDigits() + "-" + ccNumberObject.getSecondFourDigits() + "-" + ccNumberObject.getThirdFourDigits() + "-" + ccNumberObject.getFourthFourDigits();
    }
}
