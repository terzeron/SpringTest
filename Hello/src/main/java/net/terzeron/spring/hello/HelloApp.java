package net.terzeron.spring.hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		GreetingService greetingService = (GreetingService) factory.getBean("greetingService");
		greetingService.sayGreeting();
	}
}
