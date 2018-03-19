package net.terzeron.spring.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightApp {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext(
						"META-INF/spring/knight.xml");
		Knight knight = context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
