package com.terzeron.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInit {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
        System.out.println("after initialization");
        applicationContext.getBean("addressBean");
    }
}
