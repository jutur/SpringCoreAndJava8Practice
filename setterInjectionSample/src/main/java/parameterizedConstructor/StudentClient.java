package parameterizedConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("student.xml");
        Student st = ap.getBean("student", Student.class);
        System.out.println(st.getId());
        System.out.println(st.getName());

    }
}
