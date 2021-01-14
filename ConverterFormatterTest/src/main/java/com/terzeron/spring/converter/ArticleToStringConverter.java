package com.terzeron.spring.converter;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.Converter;

public class ArticleToStringConverter implements Converter<Article, String> {
    public String convert(Article article) {
        if (article == null) {
            throw new ConversionFailedException(TypeDescriptor.valueOf(Article.class),
                    TypeDescriptor.valueOf(String.class), article, null);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(article.getName());
        builder.append("-");
        builder.append(article.getCategory());
        return builder.toString();
    }
}
