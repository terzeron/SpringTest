package com.terzeron.spring.converter;

import org.springframework.core.convert.support.ConversionServiceFactory;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.Arrays;
import java.util.List;

public class BuiltInForCollectionTypeTest {
    public static void main(String[] args) {
        GenericConversionService conversionService = ConversionServiceFactory.createDefaultConversionService();
        testToArray(conversionService);
        testToString(conversionService);
        testToObject(conversionService);
    }

    private static void testToArray(GenericConversionService conversionService) {
        List<String> languages = Arrays.asList("C", "C++", "Java");
        String[] stringArray = conversionService.convert(languages, String[].class);
        for (String language : stringArray) {
            System.out.println("language is " + language);
        }
    }

    private static void testToString(GenericConversionService conversionService) {
        List<String> languages = Arrays.asList("C", "C++", "Java");
        String languagesAsString = conversionService.convert(languages, String.class);
        System.out.println(languagesAsString);
    }

    private static void testToObject(GenericConversionService conversionService) {
        conversionService.addConverter(new ArticleToStringConverter());
        Article articleObject = new Article("Introduction to Google Guice", "Google Guice");
        String articleAsString = conversionService.convert(new Article[]{articleObject}, String.class);
        System.out.println("Article --> " + articleAsString);
    }
}
