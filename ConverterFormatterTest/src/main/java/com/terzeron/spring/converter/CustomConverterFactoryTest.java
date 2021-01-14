package com.terzeron.spring.converter;

import org.springframework.core.convert.support.GenericConversionService;

public class CustomConverterFactoryTest {
    public static void main(String[] args) {
        GenericConversionService conversionService = new GenericConversionService();
        conversionService.addConverterFactory(new ArticleToStringConverterFactory());
        conversionService.addConverterFactory(new StringToArticleConverterFactory());

        String articleAsString = "Java Programming,Java";
        Article article = conversionService.convert(articleAsString, Article.class);
        System.out.println("Article name is " + article.getName());
        System.out.println("Article category is " + article.getCategory());

        articleAsString = conversionService.convert(article, String.class);
        System.out.println(articleAsString);
    }
}
