package net.terzeron.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        BusinessInterface businessInterface = (BusinessInterface) ctx.getBean("businesslogicbean");
        businessInterface.businessLogicMethod();
    }
}
