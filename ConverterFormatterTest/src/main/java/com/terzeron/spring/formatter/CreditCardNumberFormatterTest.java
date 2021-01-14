package com.terzeron.spring.formatter;

import org.springframework.format.support.FormattingConversionService;

public class CreditCardNumberFormatterTest {
    public static void main(String[] args) {
        FormattingConversionService service = new FormattingConversionService();

        CreditCardNumberParser parser = new CreditCardNumberParser();
        CreditCardNumberPrinter printer = new CreditCardNumberPrinter();
        service.addFormatterForFieldType(CreditCardNumber.class, printer, parser);

        test1(service);
        test2(service);
    }

    private static void test1(FormattingConversionService service) {
        String ccNumber = "1111-2222-3333-4444";
        CreditCardNumber ccNumberObject = service.convert(ccNumber, CreditCardNumber.class);
        System.out.println(ccNumberObject.getFirstFourDigits());
        System.out.println(ccNumberObject.getSecondFourDigits());
        System.out.println(ccNumberObject.getThirdFourDigits());
        System.out.println(ccNumberObject.getFourthFourDigits());
    }

    private static void test2(FormattingConversionService service) {
        CreditCardNumber ccNumberObject = new CreditCardNumber(1111, 2222, 3333, 4444);
        String ccNumber = service.convert(ccNumberObject, String.class);
        System.out.println("CC Number is " + ccNumber);
    }
}
