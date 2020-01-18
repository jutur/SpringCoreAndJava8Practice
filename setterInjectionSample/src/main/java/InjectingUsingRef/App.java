package InjectingUsingRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("employee-setter.xml");
        Employee emp = ap.getBean("employee", Employee.class);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getAddress().getHouseNo());
        System.out.println(emp.getAddress().getCity());
        System.out.println(emp.getAddress().getCountry());
        System.out.println(emp.getAddress().getState());
    }
}
