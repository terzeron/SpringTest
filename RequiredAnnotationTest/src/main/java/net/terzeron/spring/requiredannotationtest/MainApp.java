package net.terzeron.spring.requiredannotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by terzeron on 2017. 10. 23..
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) context.getBean("product");
        System.out.println("Product name:" + product.getName());
        System.out.println("Price:" + product.getPrice());
    }
}
