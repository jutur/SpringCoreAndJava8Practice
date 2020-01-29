package inheritanceCar;

import org.springframework.beans.factory.annotation.Required;


public class Car {

    private int id;
    private String name;
    private String engineType;
    private String engineModel;

    public Car() {
        System.out.println("car default constructor");
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineType() {
        return engineType;
    }

    //The @Required annotation applies to bean property setter methods and it indicates that the affected bean property must be populated in XML configuration file at configuration time
    @Required
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }
}
