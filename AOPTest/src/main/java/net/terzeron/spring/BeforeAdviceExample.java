package net.terzeron.spring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeAdviceExample implements MethodBeforeAdvice {
    public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
        System.out.println("Before advice called");
    }
}
