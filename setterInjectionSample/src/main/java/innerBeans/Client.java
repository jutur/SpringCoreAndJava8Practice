package innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("innerBean.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.getAddress().getHno());

        String[] aliases = context.getAliases("employee");
        for(int i =0; i< aliases.length; i++) {
            System.out.println(aliases[i]);
        }
    }
}
