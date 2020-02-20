package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-context.xml");
        Customer customer = context.getBean("customer", Customer.class);
        System.out.println(customer.getPerson().getName());
    }
}
