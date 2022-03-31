package com.terzeron.spring.converter;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.support.ConversionServiceFactory;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.List;

public class BuiltInForStringTypeTest {
    public static void main(String[] args) {
        //GenericConversionService conversionService = ConversionServiceFactory.createDefaultConversionService();
        GenericConversionService conversionService = new DefaultConversionService();
        testToArray(conversionService);
        testToCollection(conversionService);
        testToBoolean(conversionService);
        testToCharacter(conversionService);
        testToNumber(conversionService);
        testToEnum(conversionService);
    }

    private static void testToArray(GenericConversionService conversionService) {
        String[] stringArray = conversionService.convert("One,Two,Three", String[].class);
        for (String element : stringArray) {
            System.out.println("Element is " + element);
        }
    }

    private static void testToCollection(GenericConversionService conversionService) {
        List<String> listOfStrings = conversionService.convert("One,Two,Three", List.class);
        for (String element: listOfStrings) {
            System.out.println("Element is " + element);
        }
    }

    private static void testToBoolean(GenericConversionService conversionService) {
        Boolean data = null;
        data = conversionService.convert("true", Boolean.class);
        System.out.println("Boolean value is " + data);
        data = conversionService.convert("no", Boolean.class);
        System.out.println("Boolean value is " + data);
    }

    private static void testToCharacter(GenericConversionService conversionService) {
        Character data = null;
        data = conversionService.convert("A", Character.class);
        System.out.println("Character value is " + data);
        try {
            data = conversionService.convert("Exception", Character.class);
            System.out.println("Character value is " + data);
        } catch (ConversionFailedException e) {
            System.out.println("exception occurred");
        }
    }

    private static void testToNumber(GenericConversionService conversionService) {
        Integer intData = conversionService.convert("124", Integer.class);
        System.out.println("Integer value is " + intData);
        Float floatData = conversionService.convert("215.3f", Float.class);
        System.out.println("Float value is " + floatData);
    }

    private static void testToEnum(GenericConversionService conversionService) {
        TaskStatus taskStatus = conversionService.convert("PENDING", TaskStatus.class);
        System.out.println("Task status is " + taskStatus);
    }
}
