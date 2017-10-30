package net.terzeron.spring.beanfactorytest;

public class GreetingServiceImpl implements net.terzeron.spring.beanfactorytest.GreetingService {
	private String greeting;

	public GreetingServiceImpl() {}
	
	public GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}
	
	public void sayGreeting() {
		System.out.println(greeting);
	}
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
