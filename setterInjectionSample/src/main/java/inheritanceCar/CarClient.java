package inheritanceCar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarClient {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("car-Inheritance.xml");
        Car ritz = ap.getBean("ritz", Car.class);
        CarClient cl = new CarClient();
        cl.showDetails(ritz);
        Car maruthi = ap.getBean("maruthi", Car.class);
        cl.showDetails(maruthi);
        Car parentCar = ap.getBean("parentCar", Car.class);
        cl.showDetails(parentCar);

    }

    private void showDetails(Car car) {
        System.out.println(car.getId());
        System.out.println(car.getName());
        System.out.println(car.getEngineModel());
        System.out.println(car.getEngineType());
    }
}
