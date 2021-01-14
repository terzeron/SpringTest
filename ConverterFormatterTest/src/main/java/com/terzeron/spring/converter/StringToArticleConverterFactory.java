package com.terzeron.spring.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class StringToArticleConverterFactory implements ConverterFactory<String, Article> {
    public Converter<String, Article> getConverter(Class arg0) {
        return (Converter<String, Article>) new StringToArticleConverter();
    }
}
