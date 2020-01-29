package factoryMethod;

import java.util.Calendar;

public class Alarm {

    private Calendar calendar;

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public  void ring() {
        System.out.println(calendar.getTime());
    }
}
