package net.terzeron.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

        CustomerBO customer = (CustomerBO) appContext.getBean("customerBO");
        customer.addCustomer();
        customer.addCustomerReturnValue();
        customer.addCustomerAround("jake");
        customer.addCustomerThrowException();
    }
}