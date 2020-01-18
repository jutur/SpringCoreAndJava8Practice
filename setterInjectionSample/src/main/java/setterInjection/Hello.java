package setterInjection;

public class Hello {
    private String message;
// Spring container using default constuctor to create Bean object and perform inject using setter method - Setter Injection
    public Hello() {
        System.out.println("Hello Bean Default constructor");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
