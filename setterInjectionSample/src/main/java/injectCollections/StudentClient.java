package injectCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentClient {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("student-collection.xml");
        Student student = ap.getBean("student", Student.class);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getCourses());
        System.out.println(student.getFeeDetails());
        System.out.println(student.getMobileNo());
        System.out.println(student.getProperties());

    }
}
