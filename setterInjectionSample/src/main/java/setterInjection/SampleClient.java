package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleClient {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("hello.xml");
        Hello hp = ap.getBean("hello", Hello.class);
        System.out.println(hp.getMessage());
    }
}
