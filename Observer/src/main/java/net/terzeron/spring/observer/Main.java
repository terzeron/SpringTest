package net.terzeron.spring.observer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by terzeron on 2017. 10. 23..
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/ObserverContext.xml");
        TownCrier crier = (TownCrier) context.getBean("townCrier");
        crier.setMessage("it is 10 'clock and all is well");

    }
}
