package parameterizedConstructor;

public class Student {
    private String name;
    private String id;
// constructor injection -> Spring container using constructor to perform injection
    public Student(String name, String id) {
        System.out.println("Student parametrized constructor");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
