package com.terzeron.spring.converter;

import org.springframework.core.convert.support.ConversionServiceFactory;
import org.springframework.core.convert.support.GenericConversionService;

import java.util.List;

public class BuiltInForArrayTypeTest {
    public static void main(String[] args) {
        GenericConversionService conversionService = ConversionServiceFactory.createDefaultConversionService();
        testToCollection(conversionService);
        testToString(conversionService);
        testToObject(conversionService);
    }

    private static void testToCollection(GenericConversionService conversionService) {
        List<String> listOfColors = conversionService.convert(new String[]{"Red", "Blue", "Green"}, List.class);
        for (String color : listOfColors) {
            System.out.println(color);
        }
    }

    private static void testToString(GenericConversionService conversionService) {
        String colors = conversionService.convert(new String[]{"Red", "Blue", "Green"}, String.class);
        System.out.println(colors);
    }

    private static void testToObject(GenericConversionService conversionService) {
        conversionService.addConverter(new StringToArticleConverter());
        Article article = conversionService.convert(new String[]{"Introduction to Google Guice,Google Guice"}, Article.class);
        System.out.println("Article name is " + article.getName());
        System.out.println("Article category is " + article.getCategory());
    }
}
