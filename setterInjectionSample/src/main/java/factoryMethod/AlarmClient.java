package factoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlarmClient {

    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("factory.xml");
        Alarm alarm = ap.getBean("alarm", Alarm.class);
        alarm.ring();
    }
}
