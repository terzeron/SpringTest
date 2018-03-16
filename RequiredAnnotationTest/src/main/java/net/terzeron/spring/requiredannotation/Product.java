package net.terzeron.spring.requiredannotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by terzeron on 2017. 10. 23..
 */
public class Product {
    private Integer price;
    private String name;

    public Integer getPrice() {
        return price;
    }

    @Required
    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
}
