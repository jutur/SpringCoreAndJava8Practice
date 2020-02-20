package i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class TestI18NLocale {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springi18n.xml");
        String message = context.getMessage("msg.text", null, Locale.US);
        System.out.println(message);
    }
}
