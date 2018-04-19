import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String [] args)
    {
        // Read the configuration file
        ApplicationContext ctx
                = new ClassPathXmlApplicationContext("spring-config.xml");

        //Instantiate an object
        IBusinessLogic testObject = (IBusinessLogic) ctx.getBean("businesslogicbean");

        //Execute the public method of the bean (the test)
        testObject.foo();
    }
}