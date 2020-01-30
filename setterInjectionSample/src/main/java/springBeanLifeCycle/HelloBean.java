package springBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloBean {//implements InitializingBean, DisposableBean {

    private String message;

    public HelloBean() {
        System.out.println("Hello Bean Default Constructor");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Set message Called");
        this.message = message;
    }

/*    // This method is called after properties are set by spring container
    public void afterPropertiesSet() throws Exception {
        System.out.println("after properties set called");
    }
    // Destroy method is called in some cases like shut downing the container
    public void destroy() throws Exception {
        System.out.println("Destroy method called");
    }*/

   @PostConstruct
   public void myInit() {
       System.out.println("Init method called");
   }

   @PreDestroy
   public void myDestroy() {
       System.out.println("MyDestroy method called");
   }

}
