package com.terzeron.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;

public class LoadingWithBeanFactory {
    public static void main(String[] args) {
        System.out.println(new File(".").getAbsolutePath());
        Resource xmlResource = new FileSystemResource("target/classes/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(xmlResource);
        Employee employeeBean = (Employee) factory.getBean("employeeBean");
        System.out.println(employeeBean.getName());
        System.out.println(employeeBean.getAddress().getStreet());
        System.out.println(employeeBean.getAddress().getCity());
        System.out.println(employeeBean.getAddress().getPincode());
    }
}
