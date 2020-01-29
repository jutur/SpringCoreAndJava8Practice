package activeContainerLazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("hello-lazyInit.xml");
        System.out.println("containerActivated");

/*        Hello hello = ap.getBean("hello", Hello.class);
        System.out.println(hello.getMessage());*/
    }
}
