package com.terzeron.spring.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

public class ArticleToStringConverterFactory implements ConverterFactory<Article, String> {
    public Converter<Article, String> getConverter(Class arg0) {
        return (Converter<Article, String>) new ArticleToStringConverter();
    }
}
