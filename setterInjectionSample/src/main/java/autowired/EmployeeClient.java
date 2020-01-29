package autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {
    public static void main(String[] args) {

        //active container means when you load the xml file it creates the bean objects
        //lazy container creates bean objects when you call the getBean method
        ApplicationContext ap = new ClassPathXmlApplicationContext("autoWiringConfig.xml");
        Employee employee = ap.getBean("employee", Employee.class);

        System.out.println(employee.getAddress().getHno());
        System.out.println(employee.getAddress().getCity());
        System.out.println(employee.getAddress().getState());
        System.out.println(employee.getAddress().getStreetName());

/*
        System.out.println(employee.getAddress2().getHno());
        System.out.println(employee.getAddress2().getCity());
        System.out.println(employee.getAddress2().getState());
        System.out.println(employee.getAddress2().getStreetName());
*/

        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
