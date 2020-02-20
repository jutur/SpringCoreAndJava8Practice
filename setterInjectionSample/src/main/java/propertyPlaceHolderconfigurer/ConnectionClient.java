package propertyPlaceHolderconfigurer;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConnectionClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyPlaceHolderConfigurer.xml");
        ConnectionUtil util = context.getBean("util", ConnectionUtil.class);
        util.getConnection();
    }
}
