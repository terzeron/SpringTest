package com.terzeron.spring.formatter;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditCardNumber {
    private int firstFourDigits;
    private int secondFourDigits;
    private int thirdFourDigits;
    private int fourthFourDigits;
}
