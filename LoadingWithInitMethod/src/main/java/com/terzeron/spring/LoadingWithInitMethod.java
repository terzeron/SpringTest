package com.terzeron.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadingWithInitMethod {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        CustomerService customer = (CustomerService) applicationContext.getBean("customerService");
        System.out.println(customer);
    }
}
