package activeContainerLazyInit;

public class Hello {
    private String message;

    public Hello() {
        System.out.println("Hello Bean default constructor");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
