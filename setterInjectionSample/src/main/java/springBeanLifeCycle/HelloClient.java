package springBeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
    public static void main(String[] args) {
        AbstractApplicationContext ap = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        HelloBean hb = ap.getBean("helloMessage", HelloBean.class);
        System.out.println(hb.getMessage());
        ap.registerShutdownHook();
    }
}
