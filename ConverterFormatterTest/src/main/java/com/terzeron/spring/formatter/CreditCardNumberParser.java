package com.terzeron.spring.formatter;

import org.springframework.format.Parser;

import org.springframework.expression.ParseException;
import java.util.Locale;

public class CreditCardNumberParser implements Parser {
    public CreditCardNumber parse(String ccNumber, Locale locale) throws ParseException {
        String digitsArray[] = ccNumber.split("-");
        if (digitsArray == null || digitsArray.length != 4) {
            throw new ParseException(-1, "Invalid format");
        }

        CreditCardNumber ccNumberObject = new CreditCardNumber();
        ccNumberObject.setFirstFourDigits(Integer.parseInt(digitsArray[0]));
        ccNumberObject.setSecondFourDigits(Integer.parseInt(digitsArray[1]));
        ccNumberObject.setThirdFourDigits(Integer.parseInt(digitsArray[2]));
        ccNumberObject.setFourthFourDigits(Integer.parseInt(digitsArray[3]));

        return ccNumberObject;
    }
}
