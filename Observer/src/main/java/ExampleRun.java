import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by terzeron on 2017. 10. 23..
 */
public class ExampleRun {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("/config/ObserverContext.xml");
        TownCrier crier = (TownCrier) context.getBean("townCrier");
        crier.setMessage("it is 10 'clock and all is well");

    }
}
