package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    public Person getPerson() {
        return person;
    }


    //if there are two beans of same type use qualifier annotation to injct bean
    @Qualifier(value = "personB")
    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    private Person person;

}
